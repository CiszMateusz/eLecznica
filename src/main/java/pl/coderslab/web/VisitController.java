package pl.coderslab.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.coderslab.Dao.AnimalDao;
import pl.coderslab.Dao.CustomerDao;
import pl.coderslab.Dao.VisitDao;
import pl.coderslab.Dao.WarehouseDao;
import pl.coderslab.entity.Customer;
import pl.coderslab.entity.Visit;

@Controller
public class VisitController {

	@Autowired
	VisitDao visitDao;
	@Autowired
	AnimalDao animalDao;
	@Autowired
	WarehouseDao warehouseDao;
	@Autowired
	CustomerDao customerDao;
	
	
	
	@RequestMapping(value="visit/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("visits", visitDao.getList());
		return "visit/list";
	}
	@GetMapping("/visit/add")
	public String addCustomer(Model model){
		model.addAttribute("visit", new Visit());
		model.addAttribute("animals", animalDao.getList());
		model.addAttribute("warehouse", warehouseDao.getList());
		model.addAttribute("customers", customerDao.getList());
		return "visit/add";
	}
	@RequestMapping(value = "/visit/add", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Visit entity) {
		visitDao.saveVisit(entity);
		return "redirect: list";
	}
	@GetMapping("visit/edit/{id}")
	public String showEditVisit(Model model, @PathVariable long id){
		Visit visit = visitDao.findById(id);
		model.addAttribute("visit", visit);
		return "visit/edit";
	}
	@RequestMapping(value = "/visit/edit/{id}", method = RequestMethod.POST)
    public String editVisit(@Valid @ModelAttribute Visit visit, BindingResult result) {
        if (result.hasErrors()) {
            return "visit/edit/{id}";
        }
        visitDao.update(visit);
        return "visit/list";
    }
}

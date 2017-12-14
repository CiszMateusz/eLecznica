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

import pl.coderslab.Dao.CustomerDao;
import pl.coderslab.entity.Animal;
import pl.coderslab.entity.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	
	@RequestMapping(value="customer/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("customers", customerDao.getList());
		return "customer/list";
	}
	@GetMapping("/customer/add")
	public String addCustomer(Model model){
		model.addAttribute("customer", new Customer());
		return "customer/add";
	}
	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Customer entity) {
		customerDao.saveCustomer(entity);
		return "redirect: list";
	}
	@GetMapping("customer/edit/{id}")
	public String showEditCustomer(Model model, @PathVariable long id){
		Customer customer = customerDao.findById(id);
		model.addAttribute("customer", customer);
		return "customer/edit";
	}
	@RequestMapping(value = "/customer/edit/{id}", method = RequestMethod.POST)
    public String editCustomer(@Valid @ModelAttribute Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            return "customer/edit/{id}";
        }
        customerDao.update(customer);
        return "customer/list";
    }
}	

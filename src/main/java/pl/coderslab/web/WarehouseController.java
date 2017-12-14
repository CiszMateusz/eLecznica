package pl.coderslab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import pl.coderslab.Dao.WarehouseDao;

import pl.coderslab.entity.Warehouse;

@Controller
public class WarehouseController {
	
	@Autowired
	WarehouseDao warehouseDao;
	
	@RequestMapping(value="warehouse/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("warehouses", warehouseDao.getList());
		return "warehouse/list";
	}
	@GetMapping("/warehouse/add")
	public String addCustomer(Model model){
		model.addAttribute("warehouse", new Warehouse());
		return "warehouse/add";
	}
	@RequestMapping(value = "/warehouse/add", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Warehouse entity) {
		warehouseDao.saveWarehouse(entity);
		return "redirect: list";
	}
}	

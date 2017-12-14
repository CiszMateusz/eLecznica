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
import pl.coderslab.entity.Animal;

@Controller
public class AnimalController {

	@Autowired
	AnimalDao animalDao;
	
	@RequestMapping(value="animal/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("animals", animalDao.getList());
		return "animal/list";
	}
	@GetMapping("/animal/add")
	public String addAnimal(Model model){
		model.addAttribute("animal", new Animal());
		return "animal/add";
	}
	@RequestMapping(value = "/animal/add", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Animal entity) {
		animalDao.saveAnimal(entity);
		return "redirect: list";
	}
	@GetMapping("/animal/edit/{id}")
	public String showEditAnimal(Model model, @PathVariable long id){
		Animal animal = animalDao.findById(id);
		model.addAttribute("animal", animal);
		return "animal/edit";
	}
	@RequestMapping(value = "/animal/edit/{id}", method = RequestMethod.POST)
    public String editAnimal(@Valid @ModelAttribute Animal animal, BindingResult result) {
        if (result.hasErrors()) {
            return "animal/edit/{id}";
        }
        animalDao.update(animal);
        return "animal/success";
    }
}
	

	

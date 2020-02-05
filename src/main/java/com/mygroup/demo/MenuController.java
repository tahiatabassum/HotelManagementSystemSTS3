package com.mygroup.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mygroup.demo.entities.Menu;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/menu")

public class MenuController {
	@Autowired
	private com.mygroup.demo.repository.MenuRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Menu> getAllMenu() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)

	public Menu getMenuById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)

	public void modifyMenuById(@PathVariable("id") ObjectId id, @Valid @RequestBody Menu menu) {
		menu.set_id(id);
		repository.save(menu);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)

	public Menu createMenu(@Valid @RequestBody Menu menu) {
		menu.set_id(ObjectId.get());
		repository.save(menu);
		return menu;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)

	public void deleteMenu(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
	

}


package com.mygroup.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mygroup.demo.entities.Hotel;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hotel")

public class HotelController {
	@Autowired
	private com.mygroup.demo.repository.HotelRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Hotel> getAllHotel() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)

	public Hotel getHotelById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)

	public void modifyHotelById(@PathVariable("id") ObjectId id, @Valid @RequestBody Hotel hotel) {
		hotel.set_id(id);
		repository.save(hotel);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)

	public Hotel createHotel(@Valid @RequestBody Hotel hotel) {
		hotel.set_id(ObjectId.get());
		repository.save(hotel);
		return hotel;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)

	public void deleteHotel(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
	

}


package com.mygroup.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mygroup.demo.entities.Staff;
import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	private com.mygroup.demo.repository.StaffRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Staff> getAllStaff() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)

	public Staff getStaffById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)

	public void modifyStaffById(@PathVariable("id") ObjectId id, @Valid @RequestBody Staff staff) {
		staff.set_id(id);
		repository.save(staff);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)

	public Staff createStaff(@Valid @RequestBody Staff staff) {
		staff.set_id(ObjectId.get());
		repository.save(staff);
		return staff;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)

	public void deleteStaff(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}

}

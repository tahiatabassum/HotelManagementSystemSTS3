package com.mygroup.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mygroup.demo.entities.Order;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")

public class OrderController {
	@Autowired
	private com.mygroup.demo.repository.OrderRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Order> getAllOrder() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)

	public Order getOrderById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)

	public void modifyOrderById(@PathVariable("id") ObjectId id, @Valid @RequestBody Order order) {
		order.set_id(id);
		repository.save(order);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)

	public Order createOrder(@Valid @RequestBody Order order) {
		order.set_id(ObjectId.get());
		repository.save(order);
		return order;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)

	public void deleteOrder(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
	

}

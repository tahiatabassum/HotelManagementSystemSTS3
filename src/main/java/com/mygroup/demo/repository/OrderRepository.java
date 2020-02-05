package com.mygroup.demo.repository;

import org.bson.types.ObjectId;
import com.mygroup.demo.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
	Order findBy_id(ObjectId _id);

}

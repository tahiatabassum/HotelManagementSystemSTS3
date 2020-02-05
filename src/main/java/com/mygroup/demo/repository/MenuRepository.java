package com.mygroup.demo.repository;

import org.bson.types.ObjectId;
import com.mygroup.demo.entities.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {
	Menu findBy_id(ObjectId _id);
}

package com.mygroup.demo.repository;

import com.mygroup.demo.entities.Staff;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StaffRepository extends MongoRepository<Staff, String> {
	Staff findBy_id(ObjectId _id);
}

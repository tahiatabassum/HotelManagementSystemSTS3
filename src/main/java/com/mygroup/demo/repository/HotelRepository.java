package com.mygroup.demo.repository;

import org.bson.types.ObjectId;
import com.mygroup.demo.entities.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
	Hotel findBy_id(ObjectId _id);
}

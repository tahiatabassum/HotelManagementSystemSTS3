package com.mygroup.demo.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Order {

	@Id
	public ObjectId _id;
	
	public String service;
	
	//House Keeping || RoomService || Spa || Internet || Parking ||
	
	public double cost;
	public int extenson;
	/**
	 * @param _id
	 * @param service
	 * @param cost
	 * @param extenson
	 */
	public Order(ObjectId _id, String service, double cost, int extenson) {
		super();
		this._id = _id;
		this.service = service;
		this.cost = cost;
		this.extenson = extenson;
	}
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getExtenson() {
		return extenson;
	}
	public void setExtenson(int extenson) {
		this.extenson = extenson;
	}

	
	

}

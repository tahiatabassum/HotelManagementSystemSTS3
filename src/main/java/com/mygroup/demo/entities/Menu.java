package com.mygroup.demo.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Menu {
	@Id
	public ObjectId _id;
	public String foodItem;
	public String foodDisc;
	public double cost;

	/**
	 * @param _id
	 * @param foodItem
	 * @param foodDisc
	 * @param cost
	 */
	public Menu(ObjectId _id, String foodItem, String foodDisc, double cost) {
		super();
		this._id = _id;
		this.foodItem = foodItem;
		this.foodDisc = foodDisc;
		this.cost = cost;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public String getFoodDisc() {
		return foodDisc;
	}

	public void setFoodDisc(String foodDisc) {
		this.foodDisc = foodDisc;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}

package com.mygroup.demo.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Hotel {
	@Id
	public ObjectId _id;
	public int roomNo;
	public String roomDisc;
	public double roomCostPerNight;

	/**
	 * @param _id
	 * @param roomNo
	 * @param roomDisc
	 * @param roomCostPerNight
	 */
	public Hotel(ObjectId _id, int roomNo, String roomDisc, double roomCostPerNight) {
		super();
		this._id = _id;
		this.roomNo = roomNo;
		this.roomDisc = roomDisc;
		this.roomCostPerNight = roomCostPerNight;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomDisc() {
		return roomDisc;
	}

	public void setRoomDisc(String roomDisc) {
		this.roomDisc = roomDisc;
	}

	public double getRoomCostPerNight() {
		return roomCostPerNight;
	}

	public void setRoomCostPerNight(double roomCostPerNight) {
		this.roomCostPerNight = roomCostPerNight;
	}

}
package com.mygroup.demo.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
public class Staff {
    
	@Id
	public ObjectId _id;

	public String staffName;
	public String profession;
	public int salary;

	/**
	 * @param _id
	 * @param staffName
	 * @param profession
	 * @param salary
	 */
	public Staff(ObjectId _id, String staffName, String profession, int salary) {
		super();
		this._id = _id;
		this.staffName = staffName;
		this.profession = profession;
		this.salary = salary;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
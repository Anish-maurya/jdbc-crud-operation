package com.ty.hibernate_car_stores_management.dto;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Address {

	private int id;
	private String cityNmae;
	private int flatNumber;
	
	@OneToOne
	private Pan pan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityNmae() {
		return cityNmae;
	}

	public void setCityNmae(String cityNmae) {
		this.cityNmae = cityNmae;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}
	
}

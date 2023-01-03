package com.ty.hibernate_car_stores_management.service;

import java.util.List;

import com.ty.hibernate_car_stores_management.dao.PersonDao;
import com.ty.hibernate_car_stores_management.dto.Address;
import com.ty.hibernate_car_stores_management.dto.Car;
import com.ty.hibernate_car_stores_management.dto.Pan;
import com.ty.hibernate_car_stores_management.dto.Person;

public class PersonService {

	PersonDao dao= new PersonDao();
	
	public void savePerson(Person person,Pan pan,Address address,List<Car> cars) {
		dao.savePerson(person, pan, address, cars);
	}
}

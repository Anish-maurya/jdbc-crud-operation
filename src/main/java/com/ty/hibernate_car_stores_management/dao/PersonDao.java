package com.ty.hibernate_car_stores_management.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hibernate_car_stores_management.dto.Address;
import com.ty.hibernate_car_stores_management.dto.Car;
import com.ty.hibernate_car_stores_management.dto.Pan;
import com.ty.hibernate_car_stores_management.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("anish");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void savePerson(Person person,Pan pan,Address address,List<Car> cars) {
		entityTransaction.begin();
		for (Car car : cars) {
			entityManager.persist(cars);
		}
		entityManager.persist(address);
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
		
		System.out.println("Data inserted");
	}
}

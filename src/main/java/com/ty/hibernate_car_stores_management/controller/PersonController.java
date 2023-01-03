package com.ty.hibernate_car_stores_management.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.hibernate_car_stores_management.dto.Address;
import com.ty.hibernate_car_stores_management.dto.Car;
import com.ty.hibernate_car_stores_management.dto.Pan;
import com.ty.hibernate_car_stores_management.dto.Person;
import com.ty.hibernate_car_stores_management.service.PersonService;

public class PersonController {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	PersonService service=new PersonService();

	 Person person=new Person();
	 Pan pan=new Pan();
	 Address address=new Address();
	 
	 
	 while(true) {
		 System.out.println("1.Insert\n2.update\n3.Delete\n4.Display");
		 int choice=scanner.nextInt();
		 switch(choice) {
		 case 1:{
			 System.out.println("Enter the Car Details:");
			 List<Car> cars=new ArrayList<Car>();
			System.out.println("Enter car Name");
			 ((Car) cars).setName(scanner.next());
			 System.out.println("Enter the Color");
			 ((Car) cars).setColor(scanner.next());
			 System.out.println("Enter the Price");
			 ((Car) cars).setPrice(scanner.nextInt());
			 System.out.println("Enter the Model");
			((Car) cars).setModel(scanner.nextDouble());
		 }break;
		 
		 default:
			 break;
		 }
	 }
}
}

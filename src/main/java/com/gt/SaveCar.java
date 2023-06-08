package com.gt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chetan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Car car_1 = new Car();
		car_1.setBrand("BMW");
		car_1.setColor("black");
		car_1.setModel("BMW89450");
		car_1.setCc("500CC");
		
		Car car_2 = new Car();
		car_2.setBrand("Fortuner");
		car_2.setColor("white");
		car_2.setModel("FORTNR95780");
		car_2.setCc("300CC");

		Car car_3 = new Car();
		car_3.setBrand("Ford");
		car_3.setColor("white");
		car_3.setModel("FORD45980");
		car_3.setCc("250CC");

		Car car_4 = new Car();
		car_4.setBrand("TATA");
		car_4.setColor("white");
		car_4.setModel("TATA740320");
		car_4.setCc("450CC");
		
		Cab cab_1 = new Cab();
		cab_1.setDname("Nagesh");
		cab_1.setCost(2500);
		cab_1.setPhno(8795421300l);

		Cab cab_2 = new Cab();
		cab_2.setDname("Shivaraj");
		cab_2.setCost(2000);
		cab_2.setPhno(8795421350l);

		Cab cab_3 = new Cab();
		cab_3.setDname("Rakshita");
		cab_3.setCost(2800);
		cab_3.setPhno(8795421400l);

		Cab cab_4 = new Cab();
		cab_4.setDname("Sachin");
		cab_4.setCost(1800);
		cab_4.setPhno(8795421450l);

		Cab cab_5 = new Cab();
		cab_5.setDname("Lokesh");
		cab_5.setCost(2300);
		cab_5.setPhno(8795421500l);
		
		
		List<Cab> cab_list_1 = new ArrayList<Cab>();
		cab_list_1.add(cab_1);
		cab_list_1.add(cab_4);
		cab_list_1.add(cab_5);

		List<Cab> cab_list_2 = new ArrayList<Cab>();
		cab_list_2.add(cab_2);
		cab_list_2.add(cab_3);
		cab_list_2.add(cab_4);

		List<Cab> cab_list_3 = new ArrayList<Cab>();
		cab_list_3.add(cab_1);
		cab_list_3.add(cab_3);
		cab_list_3.add(cab_4);

		List<Cab> cab_list_4 = new ArrayList<Cab>();
		cab_list_4.add(cab_3);
		cab_list_4.add(cab_4);
		cab_list_4.add(cab_5);
		
		car_1.setCabs(cab_list_1);
		car_2.setCabs(cab_list_2);
		car_3.setCabs(cab_list_3);
		car_4.setCabs(cab_list_4);
		
		List<Car> car_list_1 = new ArrayList<Car>();
		car_list_1.add(car_1);
		car_list_1.add(car_3);

		List<Car> car_list_2 = new ArrayList<Car>();
		car_list_2.add(car_2);

		List<Car> car_list_3 = new ArrayList<Car>();
		car_list_3.add(car_2);
		car_list_3.add(car_3);
		car_list_3.add(car_4);

		List<Car> car_list_4 = new ArrayList<Car>();
		car_list_3.add(car_1);
		car_list_3.add(car_2);
		car_list_3.add(car_3);

		List<Car> car_list_5 = new ArrayList<Car>();
		car_list_5.add(car_1);
		car_list_5.add(car_4);
		
		cab_1.setCars(car_list_1);
		cab_2.setCars(car_list_2);
		cab_3.setCars(car_list_3);
		cab_4.setCars(car_list_4);
		cab_5.setCars(car_list_5);

		entityTransaction.begin();
		entityManager.persist(car_1);
		entityManager.persist(car_2);
		entityManager.persist(car_3);
		entityManager.persist(car_4);
		entityManager.persist(cab_1);
		entityManager.persist(cab_2);
		entityManager.persist(cab_3);
		entityManager.persist(cab_4);
		entityManager.persist(cab_5);
		entityTransaction.commit();
		
	
	}

}

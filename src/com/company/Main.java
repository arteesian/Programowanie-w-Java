package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("dog", 5.0, "Graf");

	    dog.feed();

	    Phone tel = new Phone("Xiaomi", "Redmi 8T", 5.5, "Android", 2019);

	    Human me = new Human();
	    me.firstName = "Evgenii";
	    me.lastName = "Rezuev";
	    me.pet = dog;

	    System.out.println("Zwierzak nazywa się :" + me.pet.name);

	    me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.feed();
		me.pet.takeForAWalk();
		me.pet.feed();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();
		me.pet.takeForAWalk();

	    System.out.println(me.pet);

	    me.getSalary();
	    me.setSalary(5000);
	    me.getSalary();

	    Car honda = new Car("Honda", "Civic", 4000.0, 2003);
	    Car civic  = new Car("Honda", "Civic", 4000.0, 2003);

		System.out.println(me.getCar());
		me.setCar(honda);
		System.out.println(me.getCar());

		System.out.println(new Car("Honda", "Civic", 5000.0, 2003).equals(new Car("Honda", "Civic", 5000.0, 2003)));
		System.out.println(honda.equals(civic));
		System.out.println(honda);
		System.out.println(dog);
		System.out.println(me);
		System.out.println(tel);

		tel.turnOn();
		System.out.println(tel.yearOfProduction);

    }
}

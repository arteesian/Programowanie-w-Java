package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal();
	    dog.name = "Graf";
	    dog.weight = 20.0;
	    dog.species = "dog";
	    dog.feed();

	    Phone tel = new Phone();
	    tel.screenSize = 4.5;
	    tel.producer = "Xiaomi";
	    tel.model = "Redmi 8T";
	    tel.operationSystem = "Android";

	    Human me = new Human();
	    me.firstName = "Evgenii";
	    me.lastName = "Rezuev";
	    me.pet = dog;

	    System.out.println("Zwierzak nazywa się :" + me.pet.name);
    }
}

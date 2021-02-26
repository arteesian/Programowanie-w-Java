package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal();
	    dog.name = "Haiku";
	    dog.weight = 9.0;
	    dog.species = "dog";
	    dog.feed();

	    Phone tel = new Phone();
	    tel.screenSize = 4.5;
	    tel.producer = "Xiaomi";
	    tel.model = "Redmi 8T";
	    tel.operationSystem = "Android";
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("dog", 20.0, "Graf");

	    dog.feed();

	    Phone tel = new Phone("Xiaomi", "Redmi 8T", 5.5, "Android");

	    Human me = new Human();
	    me.firstName = "Evgenii";
	    me.lastName = "Rezuev";
	    me.pet = dog;

	    System.out.println("Zwierzak nazywa się :" + me.pet.name);
    }
}

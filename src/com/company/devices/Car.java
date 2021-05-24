package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    public Double value;

    public Car(String producer, String model, Double value, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    public abstract void refuel();

    @Override
    public void turnOn(){
        System.out.println("The car engine is on");
    }

    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", value: " + value;
    }

    @Override
    public void sell (Human seller, Human buyer, Double price) {
        if (seller.car != this) {
            System.out.println("You can't sell what you don't own");
        } else if (buyer.cash < price) {
            System.out.println("You can't afford this");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.car = seller.car;
            seller.pet = null;
            System.out.println("Transaction was done successfully");
        }
    }
}

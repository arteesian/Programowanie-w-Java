package com.company.devices;

public class Car {
    final String producer;
    final String model;
    public Double value;

    public Car(String producer, String model, Double value){
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

    @Override
    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", value: " + value;
    }
}

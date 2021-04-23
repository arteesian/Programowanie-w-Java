package com.company.devices;

public class Car extends Device {
    public Double value;

    public Car(String producer, String model, Double value, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", value: " + value;
    }
}

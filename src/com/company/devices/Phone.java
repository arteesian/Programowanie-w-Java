package com.company.devices;

public class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn(){
        System.out.println("Put your finger to unlock");
    }

    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", screen size: " + screenSize + ", operation system: " + operationSystem;
    }
}

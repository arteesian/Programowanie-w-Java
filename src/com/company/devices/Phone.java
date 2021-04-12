package com.company.devices;

public class Phone {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public String operationSystem;

    public Phone(String producer, String model, Double screenSize, String operationSystem){
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", screen size: " + screenSize + ", operation system: " + operationSystem;
    }
}

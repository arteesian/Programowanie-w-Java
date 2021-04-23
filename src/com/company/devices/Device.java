package com.company.devices;

public class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn(){
        System.out.println("turned on");
    }
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

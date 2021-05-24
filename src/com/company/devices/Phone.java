package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    final public Double screenSize;
    final public String operationSystem;

    public String appname;
    public Double version;
    public String serverAddress;
    public String[] applist;


    public Phone(String producer, String model, Double screenSize, String operationSystem, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public void installAnApp(String appname){
        this.appname = appname;
    }

    public void installAnApp(String appname, Double version){
        this.appname = appname;
        this.version = version;
    }

    public void installAnApp(String appname, Double version, String serverAddress){
        this.appname = appname;
        this.version = version;
        this.serverAddress = serverAddress;
    }

    public void installAnApp(String[] applist){
        this.applist = applist;
    }

    @Override
    public void turnOn(){
        System.out.println("Put your finger to unlock");
    }

    public String toString(){
        return "Producer: " + producer + ", model: " + model + ", screen size: " + screenSize + ", operation system: " + operationSystem;
    }

    @Override
    public void sell (Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println("You can't sell what you don't own");
        } else if (buyer.cash < price) {
            System.out.println("You can't afford this");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("You have sold a phone.");
        }
    }
}

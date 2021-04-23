package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.io.File;

public class Animal implements Sellable{
    final String species;
    private Double weight;
    public String name;
    public File pic;

    public Animal (String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    void feed(){
        weight += 1;
        if(weight > 0) {
            System.out.println("Thx for food. The current weight is " + weight);
        }else{
            System.out.println("Your pet is dead already. You don't want feed the corpse, right?");
        }

    }

    void takeForAWalk(){
        weight -= 1;
        if(weight > 0) {
            System.out.println("I love going for a walk! The current weight is " + weight );
        }else{
            System.out.println("Your pet is dead already. You don't want to drag the corpse with you, right?");
        }
    }

    @Override
    public String toString(){
        return "Species: " + species + ", weight: " + weight + ", name: " + name;
    }

    @Override
    public void sell (Human seller, Human buyer, Double price){
        if(seller.pet != this){
            System.out.println("You can't sell what you don't own");
        }else if(buyer.cash < price){
            System.out.println("You can't afford this");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transaction was done successfully");
        }
    }
}

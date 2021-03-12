package com.company;

import java.io.File;

public class Animal {
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
            System.out.println("Thx for food");
        }else{
            System.out.println("Your pet is dead already. You don't want feed the corpse, right?");
        }

    }

    void takeForAWalk(){
        weight -= 1;
        if(weight > 0) {
            System.out.println("I love going for a walk!");
        }else{
            System.out.println("Your pet is dead already. You don't want to drag the corpse with you, right?");
        }
    }
}

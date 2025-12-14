package com.ing.zoo;

public abstract class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name);
    }

    public void eatMeat() {
        System.out.println(name + " nomnom meat");
    }

    public void eatLeaves() {
        System.out.println(name + " cannot eat leaves! " + name + " is a carnivore.");
    }
}

package com.ing.zoo;

public class Elephant extends Herbivore {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(name + " trumpets loudly");
    }

    @Override
    public void eatLeaves() {
        System.out.println(name + " munch munch trumpet");
    }
}

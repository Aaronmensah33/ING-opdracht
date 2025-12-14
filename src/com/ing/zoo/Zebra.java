package com.ing.zoo;

public class Zebra extends Herbivore {
    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(name + " zebra zebra");
    }

    @Override
    public void eatLeaves() {
        System.out.println(name + " munch munch zebra stripes");
    }
}

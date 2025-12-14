package com.ing.zoo;

public class Wolf extends Carnivore {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(name + " howls at the moon");
    }

    @Override
    public void eatMeat() {
        System.out.println(name + " nomnom howl");
    }
}

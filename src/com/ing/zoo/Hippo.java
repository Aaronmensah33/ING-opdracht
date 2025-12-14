package com.ing.zoo;

public class Hippo extends Herbivore {
    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(name + " splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println(name + " munch munch splash splash");
    }
}

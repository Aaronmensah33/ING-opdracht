package com.ing.zoo;

public class Lion extends Carnivore {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(name + " roooaoaaaaar");
    }

    @Override
    public void eatMeat() {
        System.out.println(name + " nomnom roar");
    }
}

package com.ing.zoo;

public abstract class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    public void eatLeaves() {
        System.out.println(name + " munch munch leaves");
    }

    public void eatMeat() {
        System.out.println(name + " cannot eat meat! " + name + " is a herbivore.");
    }
}

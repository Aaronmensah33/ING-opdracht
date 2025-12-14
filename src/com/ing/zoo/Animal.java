package com.ing.zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sayHello();

    public void performTrick() {
        System.out.println(name + " cannot perform tricks!");
    }
}

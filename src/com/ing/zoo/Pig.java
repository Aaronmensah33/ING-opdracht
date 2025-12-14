package com.ing.zoo;

import java.util.Random;

public class Pig extends Herbivore{
    public Pig(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println(name + " oink oink");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(name + " munch munch oink");
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            System.out.println(name + " rolls in the mud");
        }
        else
        {
            System.out.println(name + " runs in circles");
        }
    }
}

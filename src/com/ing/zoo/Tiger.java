package com.ing.zoo;

import java.util.Random;

public class Tiger extends Carnivore {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(name + " rraaarww");
    }

    @Override
    public void eatMeat()
    {
        System.out.println(name + " nomnomnom oink wubalubadubdub");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            System.out.println(name + " jumps in tree");
        }
        else
        {
            System.out.println(name + " scratches ears");
        }
    }
}

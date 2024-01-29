package com.company.TasksSix;

import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die(int numSides){
        sides = numSides;
        roll();
    }

    public void roll(){
        Random rand = new Random();

        value = rand.nextInt(getSides()) + 1;
    }

    public int getSides(){
        return sides;
    }

    public int getValue(){
        return value;
    }
}

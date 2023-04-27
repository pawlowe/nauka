package com.company;

import java.util.Random;

public class Coin {
    private String sideUp;
    private int side;

    Random random = new Random();

    public Coin(){
        toss();
    }

    public void toss(){
        side = random.nextInt(2);
        if(side == 0){
            sideUp = "orzeł";
        }
        else{
            sideUp = "reszka";
        }
    }

    public String getSideUp(){
        return sideUp;
    }
}

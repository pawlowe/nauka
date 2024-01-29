package com.company.TasksSix;

import java.util.Scanner;

public class FreezingBoilingTemperature {
    private int temp;

    public FreezingBoilingTemperature(){
        temp = 0;
    }

    public void setTemp(int value){
        temp = value;
    }

    public int getTemp(){
        return temp;
    }

    public boolean isEthylFreezing(int value){
        if(value <= -114){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEthylBoiling(int value){
        if(value >= 78){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOxygenFreezing(int value){
        if(value <= -218){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOxygenBoiling(int value){
        if(value <= -183 && value > -218){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isWaterFreezing(int value){
        if(value <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isWaterBoiling(int value){
        if(value >= 100){
            return true;
        }
        else{
            return false;
        }
    }
}

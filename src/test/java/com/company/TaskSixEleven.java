package com.company;

import java.util.Scanner;

public class TaskSixEleven {
    public static void main(String[] args){
        int temperature;
        boolean waterBoiling, waterFreezing, ethylBoiling, ethylFreezing, oxygenBoiling, oxygenFreezing;

        Scanner keyboard = new Scanner(System.in);
        FreezingBoilingTemperature freezingBoilingTemperature = new FreezingBoilingTemperature();

        System.out.println("Podaj temperaturę: ");
        temperature = keyboard.nextInt();

        freezingBoilingTemperature.setTemp(temperature);

        ethylFreezing = freezingBoilingTemperature.isEthylFreezing(freezingBoilingTemperature.getTemp());
        if (ethylFreezing == true){
            System.out.println("W tej temperturze alkohol etylowy zamarza");
        }

        ethylBoiling = freezingBoilingTemperature.isEthylBoiling(freezingBoilingTemperature.getTemp());
        if (ethylBoiling == true){
            System.out.println("W tej temperturze alkohol etylowy wrze");
        }

        oxygenFreezing = freezingBoilingTemperature.isOxygenFreezing(freezingBoilingTemperature.getTemp());
        if (oxygenFreezing == true){
            System.out.println("W tej temperturze tlen zamarza");
        }

        oxygenBoiling = freezingBoilingTemperature.isOxygenBoiling(freezingBoilingTemperature.getTemp());
        if (oxygenBoiling == true){
            System.out.println("W tej temperturze tlen wrze");
        }

        waterFreezing = freezingBoilingTemperature.isWaterFreezing(freezingBoilingTemperature.getTemp());
        if (waterFreezing == true){
            System.out.println("W tej temperturze woda zamarza");
        }

        waterBoiling = freezingBoilingTemperature.isWaterBoiling(freezingBoilingTemperature.getTemp());
        if (waterBoiling == true){
            System.out.println("W tej temperturze woda wrze");
        }
    }
}

package com.company.TasksSeven;


import java.util.Scanner;

public class RainFall {
    final int TABLE_SIZE = 12;
    private double [] table;

    public RainFall(){
        table = new double[TABLE_SIZE];
    }

    public void setRainFall(){
        Scanner keyboard = new Scanner(System.in);
        double rainValue;
        for(int i = 0; i < table.length; i++){
            do{
                System.out.printf("Podaj wartość opadów dla %s miesiąca", i+1);
                rainValue = keyboard.nextDouble();
                if(rainValue<0){
                    System.out.println("Wprowadzono niepoprawną wartość. Wpisana wartość nie może być mniejsza od 0");
                }
            } while (rainValue<0);
           table[i] = rainValue;
        }

    }

    public double getSumOfRainFall(){
        double sumOfRain = 0.0;
        for(int i = 0; i < table.length; i++){
            sumOfRain += table[i];
        }
        return sumOfRain;
    }

    public double getAverageRainFallValue(){
        double avgOfRain = 0.0;
        avgOfRain = getSumOfRainFall()/table.length;
        return avgOfRain;
    }

    public int getTheMostRainingMonth(){
        int month = 0;
        double monthValue = 0.0;

        for (int i=0; i < table.length; i++){
            if(table[i]>monthValue){
                month = i;
            }
        }

        return month;
    }

    public int getTheMostDryMonth(){
        int month = 0;
        double monthValue = 0.0;

        for (int i=0; i < table.length; i++){
            if(table[i]<monthValue){
                month = i;
            }
        }

        return month;
    }

}

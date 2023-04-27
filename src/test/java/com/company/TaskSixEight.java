package com.company;

import java.util.Scanner;

public class TaskSixEight {
    public static void main(String[] args){
        double temp = 0;

        Temperature temperature = new Temperature(temp);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wartość stopni w Fahrenhaitach");
        temperature.setFahrenheit(keyboard.nextDouble());

        System.out.println(temperature.getFahrenheit() + " stopni F to:");
        System.out.printf("%.2f stopni celcjusza" + "\n", temperature.celsius());
        System.out.printf("%.2f stopni kelwina", temperature.kelwin());
    }
}

package com.company;

import java.util.Scanner;

public class TaskThreeNine {
    public static void main(String[] args){
        float weight, distance, price;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wprowadź wagę przesyłki: ");
        weight = keyboard.nextFloat();

        System.out.print("Wprowadź odległość w km: ");
        distance = keyboard.nextFloat();

        if (weight <= 1 && distance <= 500)
            price = 1.10F;
        else if (weight <= 1 && distance > 500)
            price = 2.20F;
        else if (weight <= 3 && distance <= 500)
            price = 2.20F;
        else if (weight <= 3 && distance > 500)
            price = 3.70F;
        else if (weight <= 5 && distance <= 500)
            price = 3.70F;
        else
            price = 3.80F;
        System.out.println("Opłata za przesyłkę wyniesie: " + price);

    }
}

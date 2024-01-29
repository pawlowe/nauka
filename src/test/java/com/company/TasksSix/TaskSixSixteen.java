package com.company.TasksSix;

import com.company.TasksSix.RoulettePocket;

import java.util.Scanner;

public class TaskSixSixteen {
    public static void main(String[] args){
        int value;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę od 1 do 36");
        value = keyboard.nextInt();

        do {
            System.out.println("Wprowadzono niepoprawną liczbę. Wprowadź liczbę od 1 do 36");
            value = keyboard.nextInt();
        } while (value < 0 || value > 36);

        RoulettePocket roulettePocket = new RoulettePocket(value);
        System.out.println("Poda liczba to przedział: " + roulettePocket.getPocketColor());
    }
}

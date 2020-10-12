package com.company;

import java.util.Scanner;

public class TaskThreeEleven {
    public static void main(String [] args){
        String surname1, surname2, surname3;
        float time1, time2, time3;

        Scanner keybord = new Scanner(System.in);

        System.out.println("Podaj nazwisko pierwszego biegacza:");
        surname1 = keybord.next();
        System.out.println("Podaj czas jaki uzyskał w minutach:");
        time1 = keybord.nextFloat();

        System.out.println("Podaj nazwisko drugiego biegacza:");
        surname2 = keybord.next();
        System.out.println("Podaj czas jaki uzyskał w minutach:");
        time2 = keybord.nextFloat();

        System.out.println("Podaj nazwisko trzeciego biegacza:");
        surname3 = keybord.next();
        System.out.println("Podaj czas jaki uzyskał w minutach:");
        time3 = keybord.nextFloat();

        if (time1 <= time2 && time1 <= time3 && time2 <= time3){
            System.out.println(surname1 + "\n" + surname2 + "\n" + surname3);
        }
        else if (time1 <= time2 && time1 <= time3 && time2 > time3)
        {
            System.out.println(surname1 + "\n" + surname3 + "\n" + surname2);
        }
        else if (time1 > time2 && time1 <= time3 && time2 <= time3)
        {
            System.out.println(surname2 + "\n" + surname1+ "\n" + surname3);
        }
        else if (time1 > time2 && time1 > time3 && time2 <= time3)
        {
            System.out.println(surname2 + "\n" + surname3 + "\n" + surname1);
        }
        else if (time1 <= time2 &&  time1 > time3 && time2 > time3)
        {
            System.out.println(surname3 + "\n" + surname1 + "\n" + surname2);
        }
        else
        {
            System.out.println(surname3 + "\n" + surname2 + "\n" + surname1);
        }
    }
}

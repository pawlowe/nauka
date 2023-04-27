package com.company;

import java.util.Scanner;

public class TaskSixTen {
    public static void main(String[] args){
        final int DIE_SIDES = 6;
        int valueC1, valueU1, valueC2, valueU2;
        int userValue = 0;
        int computerValue = 0;
        String play;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Witaj w grze oczko. W tej grze wygrywa gracz który zdobędzie więcej pkt." + "\n" +
                " A łaczna suma pkt u danego gracza nie przekroczy 21 pkt. Zaczynamy!");

        Die die = new Die(DIE_SIDES);

        die.roll();
        valueC1 = die.getValue();
        die.roll();
        valueC2 = die.getValue();
        computerValue = valueC1 + valueC2;

        die.roll();
        valueU1 = die.getValue();
        die.roll();
        valueU2 = die.getValue();
        userValue = valueU1 + valueU2;

        System.out.println("Twoja liczba pkt to: " + userValue + "\n" + "Czy chcesz rzucać jeszcze raz?");
        play = keyboard.next();

        while (play.equalsIgnoreCase("Y")){
            die.roll();
            valueC1 = die.getValue();
            computerValue += valueC1;
            die.roll();
            valueC2 = die.getValue();
            computerValue += valueC2;


            die.roll();
            valueU1 = die.getValue();
            userValue += valueU1;
            die.roll();
            valueU2 = die.getValue();
            userValue += valueU2;

            System.out.println("Twoja liczba pkt to: " + userValue + "\n" + "Czy chcesz rzucać jeszcze raz?");
            play = keyboard.next();
        }

        System.out.println("Suma punktów uzyskanych przez komputer wynosi: " + computerValue);
        System.out.println("Suma punktów uzyskanych przez Ciebie wynosi: " + userValue);

        if(userValue > computerValue && userValue <=21){
            System.out.println("Gratulacje wygrałeś!");
        }
        else if( userValue == computerValue && userValue <=21){
            System.out.println("REMIS!");
        }
        else if(computerValue > userValue && computerValue <=21){
            System.out.println("Niestety tym razem wygrał komputer");
        }
        else{
            System.out.println("Tym razem nie wygrał nikt.");
        }
    }
}

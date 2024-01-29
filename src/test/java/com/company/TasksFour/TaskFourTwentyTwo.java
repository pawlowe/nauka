package com.company.TasksFour;

import java.util.Random;
import java.util.Scanner;

public class TaskFourTwentyTwo {
    public static void main(String[] args){
        String play;
        int stake, value1, value2, value3, finalStake = 0, finalPrize = 0, prize;

        Scanner keyboard = new Scanner(System.in);
        Random value  = new Random();

        do{
            System.out.println("Wpisz kwotę o jaką chcesz zagrać. Uwaga kwota musi być podana w pełnych złotych!");
            stake = keyboard.nextInt();
            finalStake += stake;

            // 0-Wiśnia, 1-Pomarańcza, 2-Śliwka, 3-Dzwonek, 4-Melon, 5-Bar
            value1 = value.nextInt(5);
            value2 = value.nextInt(5);
            value3 = value.nextInt(5);
            System.out.println(value1 + "\t" + value2 + "\t" + value3);

            if(value1 == value2 || value1 == value3 || value2 == value3){
                prize = stake * 2;
                finalPrize += prize;
                System.out.println("Gratulacje! Wygrałeś: " + prize);
            }
            else if(value1 == value2 && value2 == value3){
               prize = stake * 3;
               finalPrize += prize;
                System.out.println("Gratulacje! Wygrałeś: " + prize);
            }
            else{
               System.out.println("Niestety tym razem się nie udało. Wygrana wynosi 0zł");
            }

            System.out.println("Czy chcesz grać dalej? Wpisz Y jeśli tak, N jeśli chcesz przerwać grę.");
            play = keyboard.next();

        } while(play.equals("Y") || play.equals("y"));

        System.out.println("Suma postawionych pieniędzy: " + finalStake + " zł." + "\n" +
                "Suma wygranych pieniędzy: " + finalPrize + " zł.");
    }
}

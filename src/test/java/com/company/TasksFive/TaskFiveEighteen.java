package com.company.TasksFive;

import java.util.Random;
import java.util.Scanner;

public class TaskFiveEighteen {
    public static void main(String[] args){
        int randomColor, userColor, result = 0;
        for(int i=1; i<=10; i++)
        { randomColor = generateColor();
          userColor =  inputUserColor();
          displayResult(randomColor);
          displayResult(userColor);
          if( randomColor == userColor){
              result += 1;
          }
        }
        System.out.println("Tyle razy udało Ci się odgadnąć kolor: " + result);
    }
    /**
     * Metoda do wybierania koloru
     * @return - colorValue - wygenerowany kolor
     */

    public static int generateColor()
    {
        Random random = new Random();
        int colorValue = random.nextInt(4) + 1;
        return colorValue;
    }

    /**
     * Pobieranie koloru od użytkownika
     * @return - userValue - kolor wprowadzony przez użytkownika
     */

    public static int inputUserColor()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź swój kolor wpisując odpowiednią liczbę:" + "\n" +
                "1 - Czerwony" + "\n" + "2 - Zielony" + "\n" + "3 - Niebieski" +
                "\n" + "4 - Pomarańczowy" + "\n" + "5 - Żółty" + "\n" );
        int userValue = keyboard.nextInt();
        return userValue;
    }

    /**
     * Wyświetlanie wybranych kolorów
     * @param - color - numer koloru
     */

    public static void displayResult(int color)
    {
        String value;
        if(color == 1) {
            value = "Czerwony";
        }
        else if(color == 2) {
            value = "Zielony";
        }
        else if(color == 3) {
            value = "Niebieski";
        }
        else if(color == 4) {
            value = "Pomarańczowy";
        }
        else{
            value = "Żółty";
        }
        System.out.println(value);
    }
}


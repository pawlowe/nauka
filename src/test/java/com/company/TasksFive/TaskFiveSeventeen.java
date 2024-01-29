package com.company.TasksFive;


import java.util.Random;
import java.util.Scanner;

public class TaskFiveSeventeen {
    public static void main(String[] args)
    {
        int computer, user;

        do
        {
            computer = computerInput();
            user = userInput();
        } while (computer == user);

        displayResult(computer, user);
    }

    /**
     * Metoda sluży do inicjacji wyboru użytkownika
     * 1 - Kamień, 2 - Papier, 3-Nożyczki
     * @return value - wybór komputera
     */

    public static int computerInput()
    {
        int value;
        Random number = new Random();
        value = number.nextInt(3) + 1;
        return value;
    }

    /**
     * Metoda służy do pobrania wartości od użytkownika
     * 1 - Kamień, 2 - Papier, 3-Nożyczki
     * @return valueInput - wybór użytkownika
     */

    public static int userInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj swój wybór. Wpisz liczbę 1 jeśli wybierasz Kamień, 2 jak Papier, 3 jak Nożyczki ");
        int userInput = keyboard.nextInt();
        return userInput;
    }

    /**
     * Metoda wyświetla wynik
     * @param computerValue - wybór komputera
     * @param userValue - wybór użytkownika
     */

    public static void displayResult(int computerValue, int userValue)
    {
        if (computerValue == 1)
        {
           if (userValue == 2)
           {
               System.out.println("Papier przykrywa kamień, wygrywa użytkownik");
           }
           else
           {
               System.out.println("Kamień tępi nożyczki, tym razem wygrywa komputer");
           }
        }
        else if (computerValue == 2)
        {
            if (userValue == 1)
            {
                System.out.println("Papier przykrywa kamień, wygrywa komputer");
            }
            else
            {
                System.out.println("Nożyczki tną papier, wygrywa użytkownik");
            }
        }
        else
        {
            if (userValue == 1)
            {
                System.out.println("Kamień tępi nożyczki, tym razem wygrywa użytkownik");
            }
            else
            {
                System.out.println("Nożyczki tną papier, wygrywa komputer");
            }
        }
    }
}

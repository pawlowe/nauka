package com.company;

import java.util.Random;

public class TaskFiveFifteen {
    public static void main(String[] args)
    {
        int value, pnumbers = 0, nnumbers = 0;
        boolean result;

        Random random = new Random();

        for (int i = 1; i <= 100; i++)
        {
            value = random.nextInt();
            System.out.println(value);
            result = isEven(value);

            if(result)
            {
                pnumbers += 1;
            }
            else
            {
                nnumbers += 1;
            }
        }

        System.out.println("Wygenerowano " + pnumbers + " liczb parzystych.");
        System.out.println("Wygenerowano " + nnumbers + " liczb nieparzystych.");
    }

    /**
     * Metoda sprawdza czy liczba jest parzysta czy nieparzysta
     * @param number - liczba
     * @return boolean - czy liczba jest parzysta czy nieparzysta
     */

    public static boolean isEven(int number)
    {
        if ((number % 2) == 0)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
}

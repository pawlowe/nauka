package com.company;

import java.util.Scanner;

public class TaskFiveSeven {
    public static void main(String[] args)
    {
        int testsNumber = 5;
        int totalNote = 0;
        double averageNote;

        for (int i = 1; i<=testsNumber; i++)
        {
            int testPoints = getTestPoints(i);
            int testNote = getTestNote(testPoints);
            totalNote += testNote;

            System.out.printf("Twoja ocena z %s testu to: %s \n", i, testNote);
        }

        averageNote = calcAverage(totalNote, testsNumber);

        System.out.printf("Średnia punktów ze wszystkich testów wynosi: %s", averageNote);
    }

    /**
     * Pobieranie od użytkownika uzyskanej liczby punktów z danego testu
     * @param test - numer testu
     * @return points - liczba uzyskanych punktów z danego testu
     */

    public static int getTestPoints(int test)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę punktów uzyskaną w " + test + " teście.");
        int points = keyboard.nextInt();
        return points;
    }

    /**
     * Zwracanie oceny w zależności od liczby zdobytych punktów
     * @param points - liczba uzyskanych punktów
     * @return note - uzyskana ocena
     */

    public static int getTestNote(int points)
    {
        int note;

        if (points >=90)
        {
            note = 5;
        }
        else if (points <90 && points >=80)
        {
            note = 4;
        }
        else if (points <80 && points >=70)
        {
            note = 3;
        }
        else if (points <70 && points >=60)
        {
            note = 2;
        }
        else
        {
            note = 2;
        }
        return note;
    }

    /**
     * Obliczanie średniej ze wszystkich testów
     * @param testN - liczba testów
     * @param noteS - suma wszystkich ocen
     * @return averageN - średnia ocena ze wszystkich testów
     */

    public static double calcAverage(int noteS, int testN)
    {
       double averageN = (double)noteS/testN;
       return averageN;
    }
}

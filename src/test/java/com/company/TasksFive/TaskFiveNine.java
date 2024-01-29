package com.company.TasksFive;

import java.util.Scanner;

public class TaskFiveNine {
    public static void main(String[] args)
    {
        double distance, time, velocity;

        velocity = getInput("V");
        time = getInput("T");
        distance = distance(velocity, time);

        System.out.printf("Odległość wynosi %.2f km/h.\n", distance);
    }

    /**
     * Obliczanie przebytej odległości
     * @param speed - prędkość poruszania
     * @param time - czas poruszania
     * @return result - przeliczony dystans
     */

    public static double distance(double speed, double time)
    {
        double result = speed * time;
        return result;
    }

    /**
     * Pobieranie wartości od użytkownika
     * @return value - wartość podana przez użytkownika
     */

    public static double getInput(String data)
    {
        Scanner keyboard = new Scanner(System.in);
        if (data.equalsIgnoreCase("V"))
        {
            System.out.println("Wprowadź prędkość z jaką porusza się pojazd w km/h");
        }
        else
        {
            System.out.println("Wprowadź czas przez jaki poruszał się pojazd w godzinach");
        }

        double value = keyboard.nextDouble();
        return value;
    }
}

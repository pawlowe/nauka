package com.company;

import java.util.Scanner;

public class TaskFiveTwelve {
    public static void main(String[] args)
    {
        double bulk, velocity, kineticE;

        bulk = getValue("M");
        velocity = getValue("V");
        kineticE = kineticEnergy(bulk, velocity);
        System.out.printf("Energia kinetyczna dla tego obiektu wynosi: %.2f \n", kineticE);
    }

    /**
     * Pobieranie danych od użytkownika
     * @param info - parametr decydujący o tym jaki komentarz ma się pojawić użytkownikowi
     * @return value - metoda zwraca wartość wpisaną przez użytkownika
     */

    public static double getValue(String info)
    {
        Scanner keyboard = new Scanner(System.in);

        if (info.equalsIgnoreCase("M"))
        {
            System.out.print("Podaj masę obiektu w kilogramach\n");
        }
        else
        {
            System.out.print("Podaj prędkość obiektu w metrach na sekundę\n");
        }

        double value = keyboard.nextDouble();
        return value;
    }

    /**
     * Obliczanie energi kinetycznej
     * @param bulkValue - masa obiekty w kg
     * @param velocityValue - prędkość obiektu w m/s
     * @return kineticValue - energia kinetyczna
     */

    public static double kineticEnergy(double bulkValue, double velocityValue)
    {
        double kineticValue = 0.5 * bulkValue * Math.pow(velocityValue, 2.0);
        return kineticValue;
    }
}

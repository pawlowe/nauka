package com.company.TasksFive;

import java.util.Scanner;

public class TaskFiveThree {
    public static void main(String[] args)
    {
        double length, width, area;

        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
    }

    /**
     * Pobieranie danych od użytkownika
     * @param message - treść komunikatu
     * @return value - wartość wprowadzona przez użytkownika
     */

    public static double getValue(String message)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(message);
      double value = keyboard.nextDouble();
      return value;
    }

    /**
     * Pobieranie od użytkownika długości prostokąta
     * @return lengthValue
     */

    public static double getLength()
    {
        double lengthValue = getValue("Wpisz długość prostokąta: ");
        return lengthValue;
    }

    /**
     * Pobieranie od użytkownika szerokości trójkąta
     * @return widthValue
     */

    public static double getWidth()
    {
        double widthValue = getValue("Podaj szerokość prostokąta: ");
        return widthValue;
    }

    /**
     * Oblicznie powierzchni trójkąta
     * @param widthV - szerokość
     * @param lengthV - długość
     * @return areaValue - powierzchnia prostokąta
     */

    public static double getArea( double lengthV, double widthV)
    {
       double areaValue = lengthV * widthV;
       return areaValue;
    }

    /**
     * Wyświetlanie komunikatu
     * @param widthV - szerokość
     * @param lengthV - długość
     * @param areaV - powierzchnia
     */

    public static void displayData(double lengthV, double widthV, double areaV)
    {
        System.out.printf("Długość prostokąta wynosi: %.2f \n", lengthV);
        System.out.printf("Szerokość prostokąta wynosi: %.2f \n", widthV);
        System.out.printf("Powierzchnia prostokąta wynosi: %.2f \n", areaV);
    }
}

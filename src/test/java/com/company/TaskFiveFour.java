package com.company;

import java.util.Scanner;

public class TaskFiveFour {
    public static void main(String[] args)
    {
        int rooms;
        double area, paintPrice, paint, time, paintFinalPrice, workPrice, totalCost;

        rooms = getRooms();
        area = getArea(rooms);
        paintPrice = getPaintPrice();
        paint = getPaint(area);
        time = getTime(area);
        paintFinalPrice = getFinalPrice(paintPrice, paint);
        workPrice = getWorkPrice(time);
        totalCost = getCost(paintFinalPrice, workPrice);
        displayData(area, paint, time, paintFinalPrice, workPrice, totalCost);
    }

    /**
     * pobieranie danych od użytkownika
     * @param message - treść komunikatu
     * @return  input - wartość wprowadzona przez użytkownika
     */

    public static String getValue(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(message);
        String input = keyboard.nextLine();
        return input;
    }

    /**
     * Pobieranie liczby pokoi
     * @return - roomsNumber ilość pokoi
     */

    public static int getRooms()
    {
       String value;
       value = getValue("Podaj ilość pokoi do pomalowania:");

       int roomsNumber = Integer.parseInt(value);
       return roomsNumber;
    }

    /**
     * Zliczanie powierzchni do pomalowania
     * @param roomsN - liczba pokoi
     * @return areaValue - łączna powierzchnia do pomalowania
     */

    public static double getArea(int roomsN)
    {
       double areaValue = 0, value;
       String areaInput;

       for (int i =1; i <= roomsN; i++)
       {
           areaInput = getValue("Podaj powierzchnię pokoju " + i + " w m2.");
           value = Double.parseDouble(areaInput);
           areaValue += value;
       }

       return areaValue;
    }

    /**
     * Pobieranie ceny farby za litr
     * @return price - cena farby za litr
     */

    public static double getPaintPrice()
    {
        String value;
        value = getValue("Podaj cenę farby za litr w zł. ");
        double price = Double.parseDouble(value);
        return price;
    }

    /**
     * Obliczanie ile potrzeba litrów farby
     * @param areaV - powierzchnia do pomalowania w m2
     * @return paintValue - ilość potrzebnej farby
     */

    public static double getPaint(double areaV)
    {
       double paintValue = areaV / (10/1.5);
       return paintValue;
    }

    /**
     * Obliczanie czasu jaki trzeba poświęcić na pomalowanie
     * @param areaV - powierzchnia do pomalowania w m2
     * @return timeValue - czas potrzebny na pomalowanie
     */

    public static double getTime(double areaV)
    {
        double timeValue = areaV / (10.0/8.0);
        return timeValue;
    }

    /**
     * Całkowity koszt farby
     * @param paintV - ilość potrzebnej farby
     * @param priceV - cena farby za litr
     * @Return cost - całkowity koszt farby
     */

    public static double getFinalPrice(double priceV,double paintV)
    {
       double cost = paintV * priceV;
       return cost;
    }

    /**
     * Koszt robocizny
     * @param timeV - czas potrzebny na pomalowanie w h
     * @return workCost - koszt pracy
     */

    public static double getWorkPrice(double timeV)
    {
       double price = 18.0;
       double workCost = timeV * price;
       return workCost;
    }

    /**
     * Obliczanie łącznego kosztu remontu.
     * @param paintCost - koszt farby
     * @param workCost - koszty robocizny
     * @return sum - łączny koszt
     */

    public static double getCost(double paintCost, double workCost)
    {
       double sum = paintCost + workCost;
       return sum;
    }

    /**
     * Wyświetlenie danych na ekranie
     * @param areaV - powierzchnia w m2
     * @param paintV - ilość potrzebnej farby w litrach
     * @param timeV - czas potrzebny na malowanie w godzinach
     * @param paintCost - łączny koszt farby
     * @param workCost - łączny koszt robocizny
     * @param totalCost - koszt całkowity
     */

    public static void displayData(double areaV, double paintV, double timeV, double paintCost, double workCost, double totalCost)
    {
        System.out.printf("Do pomalowania %s m2 powierzhchni potrzeba: \n", areaV );
        System.out.printf("%.2f l. farby \n", paintV);
        System.out.printf("%.2f godzin \n", timeV);
        System.out.printf("Farba będzie kosztowała: %.2f zł. \n", paintCost);
        System.out.printf("Koszt robocizny wyniesie: %.2f zł. \n", workCost);
        System.out.printf("Całkowity koszt malowania wyniesie: %.2f zł. \n", totalCost);
    }
}

package com.company;

import java.util.Scanner;

public class TaskFiveEight {
    public static void main(String[] args)
    {
      int input;
      double meters;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Podaj odległość w metrach");
      meters = keyboard.nextDouble();

      while (meters <=0)
      {
          System.out.println("Odległość nie może być mniejsza niż 0");
          meters = keyboard.nextDouble();
      }

      do
      {
          menu();
          System.out.println("Wybierz jedną z opcji");
          input = keyboard.nextInt();

          while (input <1 || input >4)
          {
              System.out.println("Wybrano niepoprawną wartość. Wpisz jeszcze raz");
              input = keyboard.nextInt();
          }

          switch(input)
              {
                  case 1:
                      double value = showKilometers(meters);
                      System.out.printf("%s metrów w kilometrach to %.2f \n", meters, value);
                      break;
                  case 2:
                      value = showInches(meters);
                      System.out.printf("%s metrów w calach to %.2f \n", meters, value);
                      break;
                  case 3:
                      value = showFeet(meters);
                      System.out.printf("%s metrów w stopach to %.2f \n", meters, value);
                      break;
                  case 4:
                      System.out.println("Żegnaj!");
                      break;
              }

          } while (input != 4);
    }

    /**
     * Wyświetlanie wartości menu
     */
    public static void menu()
    {
        System.out.println(" 1. Konwersja na kilometry");
        System.out.println(" 2. Konwersja na cale");
        System.out.println(" 3. Konwersja na stopy");
        System.out.println(" 4. Wyjście z programu");
    }

    /**
     * Przeliczanie metrów na kolimetry
     * @param metersV - ilość metrów
     * @return kilometersV - odległość w kilometrach
     */

    public static double showKilometers(double metersV)
    {
        double kilometersV = metersV * 0.001;
        return kilometersV;
    }

    /**
     * Przeliczanie metrów na cale
     * @param metersV - ilość metrów
     * @return inchesV - odległość w kilometrach
     */

    public static double showInches(double metersV)
    {
        double inchesV = metersV * 39.37;
        return inchesV;
    }

    /**
     * Przeliczanie metrów na cale
     * @param metersV - ilość metrów
     * @return feetV - odległość w kilometrach
     */

    public static double showFeet(double metersV)
    {
        double feetV = metersV * 3.281;
        return feetV;
    }
}

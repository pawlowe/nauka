package com.company.TasksFive;

import java.util.Scanner;

public class TaskFiveTwo {
  public static void main(String[] args)
  {
      double basePrice, percent, price;

      basePrice = getBasePrice();
      percent = getPercent();
      price = calculateRetail(basePrice, percent);

      System.out.printf("Cena detaliczna produktu wynosi: %.2f zł.\n", price);
  }

    /**
     * Pobieranie ceny detalicznej
     * @return price - cena detaliczna
     */

    public static double getBasePrice()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cenę detaliczną produktu");

        double price = keyboard.nextDouble();
        return price;
    }

    /**
     * Pobieranie marży w %
     * @return margin - marża w %
      */

    public static double getPercent()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj marżę produktu w %");

        double margin = keyboard.nextDouble();
        return margin;
    }

    /**
     * Przeliczanie ceny detalicznej
     * @param netPrice - cena hurtowa
     * @param percent - marża w %
     * @return finalPrice - cena detaliczna
     */

    public static double calculateRetail(double netPrice, double percent)
    {
       double margin = (netPrice * percent)/100;
       double finalPrice = netPrice + margin;
       return finalPrice;
    }
}

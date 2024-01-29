package com.company.TasksFive;

import java.util.Scanner;

public class TaskFiveTen {
    public static void main(String[] args)
    {
        double shares, purchasePrice, purchaseCommission, salePrice, saleCommission, profit, next, sumProfit = 0.0;

        do
        {
            shares = getData("S");
            purchasePrice = getData("PP");
            purchaseCommission = getData("PC");
            salePrice = getData("SP");
            saleCommission = getData("SC");
            profit = calculateProfit(shares, purchasePrice, purchaseCommission, salePrice, saleCommission);
            sumProfit += profit;
            next = getData("next");
        }while(next == 1);

        displayResult(sumProfit);
    }

    /**
     * Pobieranie danych od użytkownika
     * @param dataType - typ danych dla jakiego trzeba wyświetlić odpowiedni komunikat
     * @return value - wartość wprowadzona przez użytkownika
     */

    public static double getData(String dataType)
    {
        double value;
        Scanner keyboard = new Scanner(System.in);

       if(dataType.equalsIgnoreCase("S"))
       {
           System.out.print("Wprowadź liczbę zakupionych akcji\n");
       }
       else if (dataType.equalsIgnoreCase("PP"))
       {
           System.out.print("Wprowadź cenę zakupu\n");
       }
       else if (dataType.equalsIgnoreCase("PC"))
       {
           System.out.print("Wprowadź kwotę prowizji od zakupu\n");
       }
       else if (dataType.equalsIgnoreCase("SP"))
       {
           System.out.print("Wprowadź cenę sprzedaży\n");
       }
       else if (dataType.equalsIgnoreCase("SC"))
       {
           System.out.print("Wprowadź kwotę prowizji od sprzedaży\n");
       }
       else
       {
           System.out.print("Czy chcesz podać dane dla kolejnej firmy? Tak - wpisz 1, Nie - wprowadź 0 \n");
       }

        value = keyboard.nextDouble();
        return value;
    }

    /**
     * Metoda liczy zysk ze sprzedaży akcji
     * @sh - liczba akcji
     * @pp - cena zakupu akcji
     * @pc - prowizja od zakupu akcji
     * @sp - cena sprzedaży akcji
     * @sc - prowizja od sprzedaży akcji
     * @return benefit - kwota zysku
     */

    public static double calculateProfit( double sh, double pp, double pc, double sp, double sc)
    {
        double benefit = ((sh*sp)-sc)-((sh*pp)+pc);
        return benefit;
    }

    /**
     * Wyświetlanie informacji na temat zysku
     * @profit - wartość zysku
     */

    public static void displayResult(double profit)
    {
        if (profit > 0)
        {
            System.out.printf("Wartość wypracowanego zysku wyniosła %.2f zł. \n", profit);
        }
        else if (profit < 0)
        {
            System.out.printf("Niestety nie wypracowano zysku. Strata wyniosła %.2f zł. \n", profit);
        }
        else
        {
            System.out.println("Wyszedłeś na zero");
        }
    }
}

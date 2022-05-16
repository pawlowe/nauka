package com.company;

import javax.swing.*;

public class TaskFiveSixteen {
    public static void main(String[] args)
    {
        String value1, value2, value3;
        int expectedValue, years;
        double percent, amount;

        value1 = JOptionPane.showInputDialog("Podaj wartość oczekiwanego dochodu. \n");
        expectedValue = Integer.parseInt(value1);
        value2 = JOptionPane.showInputDialog("Podaj roczną stopę procentową \n");
        percent = Double.parseDouble(value2);
        value3 = JOptionPane.showInputDialog("Podaj ilość lat przez które chcesz odkładać pieniądze \n");
        years = Integer.parseInt(value3);

        amount = presentValue(expectedValue, percent, years);

        System.out.printf("Kwota jaką musisz wpłacić aby otrzymać %s zł, wynosi %.2f zł", value1, amount);
    }

    /**
     * Metoda liczy ile pieniędzy trzeba włożyć na konto oszczędnościowe aby otrzymać oczekiwane zyski
     * @param expected - wartość oczekiwana
     * @param interestRate - roczna stopa procentowa
     * @param time - czas w latach
     * @return value - kwota jaką trzeba wpłacić
     */
    public static double presentValue(int expected, double interestRate, int time)
    {
        double value = expected/Math.pow((1+(interestRate/100)), time);
        return value;
    }
}

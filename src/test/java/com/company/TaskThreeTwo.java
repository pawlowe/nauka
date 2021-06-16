package com.company;

import javax.swing.*;

public class TaskThreeTwo {
    public static void main(String[] args)
    {
        String inputDay;
        int Day;
        String inputMonth;
        int Month;
        String inputYear;
        int Year;
        int dayAndYearValue;

        inputDay = JOptionPane.showInputDialog("Wpisz dzień miesiąca jako liczbę:");
        Day = Integer.parseInt(inputDay);
        inputMonth = JOptionPane.showInputDialog("Wpisz miesiąc w formie liczby:");
        Month = Integer.parseInt(inputMonth);
        inputYear = JOptionPane.showInputDialog("Wpisz dwie ostatnie cyfry dowolnego roku:");
        Year = Integer.parseInt(inputYear);

        dayAndYearValue = Day * Month;

        if (dayAndYearValue == Year)
        {
            JOptionPane.showMessageDialog(null, "To magiczna data");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"To nie jest magiczna data");
        }
        System.exit(0);
    }
}

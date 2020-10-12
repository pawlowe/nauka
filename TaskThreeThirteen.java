package com.company;

import javafx.util.converter.CharacterStringConverter;

import javax.swing.*;

public class TaskThreeThirteen {
    public static void main(String[] args){
        String inputPackage, inputMinutes;
        char pack;
        float minutes, cost;
        float packageA = 39.99F, packageB = 59.99F, packageC = 69.99F;
        float freeMinutesA = 450F, freeMinutesB = 900F;
        float minutesA = 0.45F, minutesB = 0.40F;

        inputPackage = JOptionPane.showInputDialog("Podaj pakiet który posiadasz: A, B lub C");
        pack = inputPackage.charAt(0);
        inputMinutes = JOptionPane.showInputDialog("Podaj ile minut wykorzystałeś w tym miesiącu na rozmowy:");
        minutes = Float.parseFloat(inputMinutes);

        if (pack == 'A' && minutes <= freeMinutesA )
        {
            cost = packageA;
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }
        else if (pack == 'A' && minutes > freeMinutesA )
        {
            cost = packageA + minutesA*(minutes - freeMinutesA);
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }
        else if (pack == 'B' && minutes <= freeMinutesB )
        {
            cost = packageB;
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }
        else if (pack == 'B' && minutes > freeMinutesB )
        {
            cost = packageB + minutesB*(minutes - freeMinutesB);
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }
        else
        {
            cost = packageC;
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }

     System.exit(0);
    }
}

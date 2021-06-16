package com.company;

import javafx.util.converter.CharacterStringConverter;

import javax.swing.*;

public class TaskThreeThirteen {
    public static void main(String[] args){
        String inputPackage, inputMinutes;
        char pack;
        float minutes, cost, costB, costBone, costC, saving;
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
            costB = packageB;
            costBone = packageB + minutesB*(minutes - freeMinutesB);
            costC = packageC;

            if (cost <= costB)
            {
                JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
            }
            else if (cost > costB && cost <=costBone)
            {
                saving = cost - costBone;
                JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
                JOptionPane.showMessageDialog(null, String.format("Wybierając pakiet B zaoszczędziłbyś: %.2f zł.", saving));
            }
            else if (cost > costBone && cost <=costC)
            {
                saving = cost - costBone;
                JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
                JOptionPane.showMessageDialog(null, String.format("Wybierając pakiet B zaoszczędziłbyś: %.2f zł.", saving));
            }
            else
            {
                saving = cost - costC;
                JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
                JOptionPane.showMessageDialog(null, String.format("Wybierając pakiet C zaoszczędziłbyś: %.2f zł.", saving));
            }
        }
        else if (pack == 'B' && minutes <= freeMinutesB )
        {
            cost = packageB;
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }
        else if (pack == 'B' && minutes > freeMinutesB )
        {
            cost = packageB + minutesB*(minutes - freeMinutesB);
            costC = packageC;
            saving = cost - costC;

            if (cost <= costC) {
                JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
            }
            else {
                JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
                JOptionPane.showMessageDialog(null, String.format("Wybierając pakiet C zaoszczędziłbyś: %.2f zł.", saving));
            }

        }
        else
        {
            cost = packageC;
            JOptionPane.showMessageDialog(null, String.format("Rachunek za ten miesiący wynosi: %.2f zł.", cost));
        }

        System.exit(0);
    }
}

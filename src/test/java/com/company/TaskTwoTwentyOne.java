package com.company;

import javax.swing.*;

public class TaskTwoTwentyOne {
    public static void main(String[] args){
        double depositAmount, annualPercent, percent, numberOfInterestCapitalisation, numberOfYears, value;
        String inputDepositAmount, inputAnnualPercent, inputNumberOfInterestCapitalisation, inputNumberOfYears;

        inputDepositAmount = JOptionPane.showInputDialog("Podaj kwotę jaką chcesz zdeponować:");
        depositAmount = Double.parseDouble(inputDepositAmount);

        inputAnnualPercent = JOptionPane.showInputDialog("Podaj roczną stopę procentową:");
        annualPercent = Double.parseDouble(inputAnnualPercent);

        inputNumberOfInterestCapitalisation = JOptionPane.showInputDialog("Wpisz ile razy odsetki będą kapitalizowane w ciągu roku:" + '\n'
                + " - miesięcznie - wpisz 12" + '\n' + " - kwartalnie - wpisz 4" + '\n'
                + " - półrocznie - wpisz 2");
        numberOfInterestCapitalisation = Double.parseDouble(inputNumberOfInterestCapitalisation);

        inputNumberOfYears = JOptionPane.showInputDialog("Przez ile lat środki będą znajdować się na koncie?:");
        numberOfYears = Double.parseDouble(inputNumberOfYears);

        percent = annualPercent / 100;
        value = depositAmount * Math.pow(1+(percent/numberOfInterestCapitalisation), numberOfInterestCapitalisation * numberOfYears);
        int newValue = (int)value;

        JOptionPane.showMessageDialog(null, "Po " + inputNumberOfYears + " latach, zarobisz ok:" + '\n' + newValue + " zł.");
        System.exit(0);
    }
}

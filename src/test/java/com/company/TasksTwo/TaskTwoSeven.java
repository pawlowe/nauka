package com.company.TasksTwo;

import javax.swing.*;

public class TaskTwoSeven {
    public static void main(String[] args){
        double stateTax = 0.04;
        double stateTaxValue;
        double localTax = 0.02;
        double localTaxValue;
        double value;
        String inputValue;
        double sum;

        inputValue = JOptionPane.showInputDialog("Ile kosztuje dany produkt");
        value = Double.parseDouble(inputValue);

        stateTaxValue = value * stateTax;
        localTaxValue = value * localTax;
        sum = value + stateTaxValue + localTaxValue;

        System.out.println("Wartość produktu wynosi: " + value + " zł. \n" +
                "Podatek stanowy wynosi: " + stateTaxValue + " zł. \n" +
                "Podatek lokalny wynosi: " + localTaxValue + " zł. \n" +
                "Całkowity koszt produktu wynosi: " + sum + " zł.");
    }
}

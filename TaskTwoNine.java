package com.company;

import javax.swing.*;

public class TaskTwoNine {
    public static void main(String[] args){
        //data
        String inputKilometers;
        float kilometers;
        float value;
        String inputLiters;
        float liters;
        // liczba przejechanych kilometrów
        inputKilometers = JOptionPane.showInputDialog("Wprowadź liczbę przejechanych kilomentrów:");
        kilometers = Float.parseFloat(inputKilometers);
        // ilość zużytego paliwa
        inputLiters = JOptionPane.showInputDialog("Wprowadź ilość zużytego paliwa:");
        liters = Float.parseFloat(inputLiters);
        // wynik
        value = kilometers/liters;

        JOptionPane.showMessageDialog(null,"Na jednym litrze paliwa przejechałeś " +
                + value +" km.");
        System.exit(0);
    }
}

package com.company.TasksTwo;

import javax.swing.*;

public class TaskTwoEight {
    public static void main(String[] args){
        //dane
        double box = 40.0;
        double portion = 10.0;
        double portionCalories = 300.0;
        double cookieCalories;
        String inputValue;
        double value;
        double ateCalories;
        //kalorie w jednym ciastku
        cookieCalories = portionCalories/(box/portion);
        //ilość zjedzonych ciastek
        inputValue = JOptionPane.showInputDialog("Podaj ilość zjedzonych ciastek:");
        value = Double.parseDouble(inputValue);
        //obliczanie zjedzonych kalorii
        ateCalories = value * cookieCalories;
        //wynik
        JOptionPane.showMessageDialog(null,"Zjadłeś " + ateCalories + " kalorii.");
        System.exit(0);
    }
}

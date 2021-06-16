package com.company;

import javax.swing.*;

public class TaskTwoTen {
    public static void main(String[] args){
        //dane
        String inputTestOne;
        double testOne;
        String inputTestTwo;
        double testTwo;
        String inputTestThree;
        double testThree;
        double averageValue;
        // wyniki z pierwszego egzaminu
        inputTestOne = JOptionPane.showInputDialog("Podaj wynik pierwszego egzaminu:");
        testOne = Double.parseDouble(inputTestOne);
        //wynik z drugiego egzaminu
        inputTestTwo = JOptionPane.showInputDialog("Podaj wynik drugiego egzaminu:");
        testTwo = Double.parseDouble(inputTestTwo);
        //wynik z trzeciego egzaminu
        inputTestThree =JOptionPane.showInputDialog("Podaj wynik z trzeciego egzaminu:");
        testThree = Double.parseDouble(inputTestThree);
        //obliczanie średniej
        averageValue =(testOne+testTwo+testThree)/3;
        //wynik
        JOptionPane.showMessageDialog(null,"Wynik z pierwszego egzaminu: "
                + testOne + '\n' + "Wynik z drugiego egzaminu: " + testTwo + '\n'
                + "Wynik z trzeciego egzaminu: " + testThree + '\n' + "Srednia z trzech egzaminów: "+
                averageValue);
    }

}

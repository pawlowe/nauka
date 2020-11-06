package com.company;

import javax.swing.*;

public class TaskThreeFifteen {
    public static void main(String[] args){
        int charge = 10;
        float checkFee, checkNumber, totalPayment;
        String input;

        input = JOptionPane.showInputDialog("Wpisz liczbę czeków wystawioną w tym miesiącu:");
        checkNumber = Float.parseFloat(input);

        if (checkNumber < 20)
        {
            checkFee = 0.10F;
            totalPayment = charge + checkNumber*checkFee;
            JOptionPane.showMessageDialog(null,"Miesięczna opłata wynosi: " + totalPayment);
        }
        else if  (checkNumber >= 20 && checkNumber < 40) {
            checkFee = 0.08F;
            totalPayment = charge + checkNumber * checkFee;
            JOptionPane.showMessageDialog(null, "Miesięczna opłata wynosi: " + totalPayment);
        }
        else if  (checkNumber >= 40 && checkNumber < 60) {
            checkFee = 0.06F;
            totalPayment = charge + checkNumber * checkFee;
            JOptionPane.showMessageDialog(null, "Miesięczna opłata wynosi: " + totalPayment);
        }
        else
        {
            checkFee = 0.04F;
            totalPayment = charge + checkNumber * checkFee;
            JOptionPane.showMessageDialog(null, "Miesięczna opłata wynosi: " + totalPayment);
        }
        System.exit(0);
    }
}

package com.company;

import javax.swing.*;

public class TaskTwoThirteen {
    public static void main(String[] args){
        String inputPrice;
        float price;
        float taxRate = 0.0675F;
        float tipRate = 0.2F;
        float tax;
        float tip;
        float value;

        inputPrice = JOptionPane.showInputDialog("Wprowadź cenę posiłku: ");
        price = Float.parseFloat(inputPrice);

        tax = price * taxRate;
        tip = (price + tax) * tipRate;
        value = price + tax + tip;

        JOptionPane.showMessageDialog(null,"Cena posiłku wynosi: " + price
                + '\n' + "Wartość podatku: " + tax + '\n' + "Wartość napiwku: " + tip + '\n' +
                "Kwota do zapłaty: " + value);
        System.exit(0);
    }
}

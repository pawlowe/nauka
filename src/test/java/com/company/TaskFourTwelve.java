package com.company;

import javax.swing.*;

public class TaskFourTwelve {
    public static void main(String[] args){
        int shop, sales, stars;
        String salesInput, value;

        for (shop = 1; shop <= 5; shop++) {
            salesInput = JOptionPane.showInputDialog("Podaj wartość sprzedaży dla sklepu " + shop);
            sales = Integer.parseInt(salesInput);
            stars = sales/100;

            System.out.print("Sklep nr " + shop + ": ");

            for (int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.exit(0);
    }
}

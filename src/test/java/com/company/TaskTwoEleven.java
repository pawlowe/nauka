package com.company;

import javax.swing.*;

public class TaskTwoEleven {
    public static void main (String[] args){
        String inputPrice;
        float price;
        float margin = 0.4F;
        float profit;

        inputPrice = JOptionPane.showInputDialog("Podaj cenę detaliczną");
        price = Float.parseFloat(inputPrice);

        profit = price * margin;

        JOptionPane.showMessageDialog(null, "Zysk wynosi: " + profit
                + " zł.");
        System.exit(0);
    }
}

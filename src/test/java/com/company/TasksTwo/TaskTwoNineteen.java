package com.company.TasksTwo;

import javax.swing.*;

public class TaskTwoNineteen {
    public static void main(String[] args){
        // first transaction
        float shares = 1000F;
        float firstPrice = 32.87F;
        float provision = 0.02F;

        float firstTransactionValue = shares * firstPrice;
        float firstProvisionValue = firstTransactionValue * provision;

        // second transaction
        float secondPrice = 33.92F;
        float secondTransactionValue = shares * secondPrice;
        float secondProvisionValue = secondTransactionValue * provision;

        // profit
        float profit = (secondTransactionValue - secondProvisionValue) - (firstTransactionValue - firstProvisionValue);

        JOptionPane.showMessageDialog(null, "Kwota zakupu akcji: " + firstTransactionValue + '\n'
                + "Prowizja za zakup akcji: " + firstProvisionValue + "\n" + "Kwota otrzyma ze sprzedaży akcji: " + secondTransactionValue
                + '\n' + "Prowizja za sprzedaż: " + secondProvisionValue + '\n' + "Zysk wynosi: " + profit);
        System.exit(0);
    }
}

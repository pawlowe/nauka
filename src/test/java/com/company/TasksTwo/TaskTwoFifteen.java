package com.company.TasksTwo;

import javax.swing.*;

public class TaskTwoFifteen {
    public static void main(String[] args){
        final float price = 21.77F;
        float share = 600F;
        float commission = 0.02F;

        float shareValue = price * share;
        float commissionValue = shareValue * commission;
        float finalValue = commissionValue + shareValue;

        JOptionPane.showMessageDialog(null, "Wartość akcji: " + shareValue + " zł." + '\n'
                + "Wartość prowizji: " + commissionValue + " zł." + '\n' + "Całkowita kwota transakcji: " + finalValue + " zł.");
        System.exit(0);
    }
}

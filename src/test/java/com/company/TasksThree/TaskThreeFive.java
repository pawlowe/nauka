package com.company.TasksThree;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class TaskThreeFive {
    public static void main(String[] args) {
        String inputBulk;
        float bulk;
        final float indicator = 9.8F;
        float weight;

        inputBulk = JOptionPane.showInputDialog("Podaj masę obiektu w kg:");
        bulk = Float.parseFloat(inputBulk);

        weight = bulk * indicator;

        if (weight > 1000)
        {
            JOptionPane.showMessageDialog(null, "Obiekt jest zbyt ciężki");
        }
        else if (weight < 10)
        {
            JOptionPane.showMessageDialog(null, "Obiekt jest zbyt lekki.");
        }

        System.exit(0);
    }
}

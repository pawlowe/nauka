package com.company.TasksThree;

import javax.swing.*;

public class TaskThreeThree {
    public static void main(String[] args){
        String inputWeight;
        float Weight;
        String inputHigh;
        float High;
        float BMI;

        inputWeight = JOptionPane.showInputDialog("Podaj swoją wagę w kilogramach:");
        Weight = Float.parseFloat(inputWeight);
        inputHigh = JOptionPane.showInputDialog("Podaj swój wzrost w metrach:");
        High = Float.parseFloat(inputHigh);

        BMI = Weight/(High*High);
        System.out.printf("%.2f", BMI);

        if (BMI >= 18.5 && BMI <= 25)
        {
            JOptionPane.showMessageDialog(null,"Masz optymalną wagę");
        }
        else if ( BMI < 18.5)
        {
            JOptionPane.showMessageDialog(null, "Masz niedowagę");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Masz nadwagę");
        }

        System.exit(0);
    }
}

package com.company.TasksThree;

import javax.swing.*;

public class TaskThreeTwelve {
    public static void main(String[] args){
        String inputWord, inputDistance;
        float airSpeed = 343F;
        float waterSpeed = 1490F;
        float steelSpeed = 5100F;
        float distance, time;

        inputWord = JOptionPane.showInputDialog("Wprowadź jeden z następujących nośników: woda, powietrze, stal");
        inputDistance = JOptionPane.showInputDialog("Podaj podaj odległość w metrach jaką ma pokonac fala dźwiękowa:");
        distance = Float.parseFloat(inputDistance);

        switch (inputWord)
        {
            case "woda":
                time = distance/waterSpeed;
                JOptionPane.showMessageDialog(null, String.format("Czas potrzebny na przebycie tej odległości w danym " +
                        "nośniku wynosi %,.2f s", time));
                break;
            case "powietrze":
                time = distance/airSpeed;
                JOptionPane.showMessageDialog(null, String.format("Czas potrzebny na przebycie tej odległości w danym " +
                        "nośniku wynosi %,.2f s", time));
                break;
            case "stal":
                time = distance/steelSpeed;
                JOptionPane.showMessageDialog(null, String.format("Czas potrzebny na przebycie tej odległości w danym " +
                        "nośniku wynosi %,.2f s", time));
                break;
        }

        System.exit(0);
    }
}

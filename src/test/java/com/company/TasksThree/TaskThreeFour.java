package com.company.TasksThree;

import javax.swing.*;

public class TaskThreeFour {
    public static void main(String[] args){
        String inputTest1;
        float Test1;
        String inputTest2;
        float Test2;
        String inputTest3;
        float Test3;
        float average;

        inputTest1 = JOptionPane.showInputDialog("Podaj ilość punktów uzyskanych z pierwszego testu:");
        Test1 = Float.parseFloat(inputTest1);
        inputTest2 = JOptionPane.showInputDialog("Podaj ilość punktów uzyskanych z drugiego testu:");
        Test2 = Float.parseFloat(inputTest2);
        inputTest3 = JOptionPane.showInputDialog("Podaj ilość punktów uzyskanych z trzeciego testu:");
        Test3 = Float.parseFloat(inputTest3);

        average = (Test1 + Test2 + Test3)/3F;
        System.out.printf("%.2f", average);

        if (average >= 90 && average <= 100)
        {
            JOptionPane.showMessageDialog(null,"Twoja ocena to 5, średnia z 3 testów wynosi: " + average);
        }
        else if (average >= 80 && average <90)
        {
            JOptionPane.showMessageDialog(null,"Twoja ocena to 4, średnia z 3 testów wynosi: " + average);
        }
        else if (average >= 70 && average <80)
        {
            JOptionPane.showMessageDialog(null,"Twoja ocena to 3, średnia z 3 testów wynosi: " + average);
        }
        else if (average >= 60 && average <70)
        {
            JOptionPane.showMessageDialog(null,"Twoja ocena to 2, średnia z 3 testów wynosi: " + average);
        }
        else if (average <60)
        {
            JOptionPane.showMessageDialog(null,"Twoja ocena to 1, średnia z 3 testów wynosi: " + average);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Wprowadziłeś błędną wartość");
        }

        System.exit(0);
    }
}

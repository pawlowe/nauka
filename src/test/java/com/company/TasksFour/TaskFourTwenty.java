package com.company.TasksFour;

import javax.swing.*;

public class TaskFourTwenty {
    public static void main(String[] args){
        String inputNumber;
        int number;

        inputNumber = JOptionPane.showInputDialog("Wprowadź dowolną liczbę całkowitą od 1 do 15");
        number = Integer.parseInt(inputNumber);
        while (number >15 || number <1)
        {
            inputNumber = JOptionPane.showInputDialog("Podano błędną liczbę. Wprowadź jeszcze raz liczbę od 1 do 15");
            number = Integer.parseInt(inputNumber);
        }

            for (int i=1; i<=number; i++)
            {
                for (int ii=1; ii<=number; ii++)
                {
                    System.out.print("X");
                }
                System.out.println();
            }
        System.exit(0);
    }
}

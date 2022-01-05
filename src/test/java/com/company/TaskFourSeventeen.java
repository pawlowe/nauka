package com.company;

import javax.swing.*;
import java.util.Random;

public class TaskFourSeventeen {
    public static void main(String[] args){
        int number, userNumber, numberOfTries = 0;
        String inputNumber;

        Random randomNumber = new Random();
        number = randomNumber.nextInt(100) + 1;

        inputNumber = JOptionPane.showInputDialog("Podaj liczbę całkowitą od 1 do 100");
        userNumber = Integer.parseInt(inputNumber);

        if (userNumber < 0){
            JOptionPane.showMessageDialog(null,"Podano liczbę spoza zakresu");
            inputNumber = JOptionPane.showInputDialog("Podaj liczbę całkowitą od 1 do 100");
            userNumber = Integer.parseInt(inputNumber);
            numberOfTries += 1;
        }
        else {
            do {
                numberOfTries += 1;
                if (userNumber > number){
                    JOptionPane.showMessageDialog(null,"Za duża liczba, spróbuj ponownie.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Za mała liczba, spróbuj ponownie.");
                }

                inputNumber = JOptionPane.showInputDialog("Podaj liczbę całkowitą od 1 do 100");
                userNumber = Integer.parseInt(inputNumber);

            }
            while (userNumber != number);

            JOptionPane.showMessageDialog(null,"Gratulacje to ta liczba! " + number +
                    " Udało Ci się zgadnąć za: " + numberOfTries);
        }
        System.exit(0);
    }
}

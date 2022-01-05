package com.company;

import javax.swing.*;
import java.util.Random;

import static javax.swing.JOptionPane.*;

public class TaskFourNineteen {
    public static void main(String[] args){
        String inputColor;
        int color, randomColor, positive = 0, negative = 0;

        Random randomNumber = new Random();

        for (int i=1; i<=10; i++) {
            inputColor = showInputDialog(null, "Wybierz jeden z kolorów wpisując przypisaną dla niego" +
                    "liczbę: \n1 - Czerwony\n2 - Zielony\n3 - Niebieski\n4 - Pomarańczowy\n5 - Żółty");
            color = Integer.parseInt(inputColor);
            if (color < 1 || color > 5)
            {
                inputColor = showInputDialog(null, "Podano nie prawidłową liczbę. \n " +
                        "Wybierz jeden z kolorów wpisując przypisaną dla niego" +
                        "liczbę: \n1 - Czerwony\n2 - Zielony\n3 - Niebieski\n4 - Pomarańczowy\n5 - Żółty");
                color = Integer.parseInt(inputColor);
            }
            else
            {
                randomColor = randomNumber.nextInt(4) + 1;
                if (color == randomColor)
                {
                    positive += 1;
                }
                else
                {
                    negative += 1;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Liczba trafionych kolorów to: " + positive);
        System.exit(0);

    }
}

package com.company;

import javax.swing.*;

public class TaskFourOne {
    public static void main(String[] args){
        String input;
        int number, i;
        int sum = 0;

        input = JOptionPane.showInputDialog("Podaj dowolną liczbę całkowitą większą od zera:");
        number = Integer.parseInt(input);

        if (number <= 0)
        {
            System.out.println("Podana nieprawidłową wartość.");
        }
        else {
            for (i = 1; i <= number; i++) {
                sum += i;
            }
            JOptionPane.showMessageDialog(null, "Suma liczb całkowitych od 1 do " + input + " wynosi: "
                    + sum);
        }
        System.exit(0);
    }

}

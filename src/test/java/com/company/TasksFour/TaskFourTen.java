package com.company.TasksFour;

import javax.swing.*;

public class TaskFourTen {
    public static void main(String[] args){
       int number, maxValue = 0, minValue;
       String inputNumber;

        inputNumber= JOptionPane.showInputDialog("Podaj dowolną liczbę całkowitą. Jeśli chcesz zakończyć wpisz -99");
        number = Integer.parseInt(inputNumber);
        minValue = number;

       while (number != -99){

           inputNumber= JOptionPane.showInputDialog("Podaj dowolną liczbę całkowitą. Jeśli chcesz zakończyć wpisz -99");
           number = Integer.parseInt(inputNumber);

           if (number < minValue & number !=-99)
           {
               minValue = number;
           }
           else if(number > maxValue & number != -99){
               maxValue = number;
           }
       }
        System.out.println("Wartosć minimalna to " + minValue);
        System.out.println("Wartosć maxymalna to " + maxValue);
       System.exit(0);
    }
}

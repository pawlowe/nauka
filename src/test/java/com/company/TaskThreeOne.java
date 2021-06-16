package com.company;

import javax.swing.*;

public class TaskThreeOne {
    public static void main(String[] args){
        String inputValue;
        int input;

        inputValue = JOptionPane.showInputDialog("Podaj liczbę od 1 do 10");
        input = Integer.parseInt(inputValue);

        switch(input)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: I");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: II");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: III");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: IV");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: V");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: VI");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: VII");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: VIII");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: IX");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"Rzymski odpowiednik to: X");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Podałeś liczbę spoza zakresu.");
        }
        System.exit(0);
    }
}

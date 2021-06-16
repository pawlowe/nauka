package com.company;

import javax.swing.*;

public class TaskTwoSixteen {
    public static void main(String[] args){
        float participants = 12467F;
        float energeticPercent = 0.14F;
        float citrusPercent = 0.64F;

        float energeticValue = participants * energeticPercent;
        int x = (int)energeticValue;
        float citrusValue = participants * citrusPercent;
        int y = (int)citrusValue;

        JOptionPane.showMessageDialog(null, "Ilość osób kupujących napój energetyczny raz w tygodniu wynosi: " + x
                + '\n' + "Ilość osób preferujących smak cytrusowy wynosi: " + y);
        System.exit(0);
    }
}

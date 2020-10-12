package com.company;

import javax.swing.*;

public class TaskTwoTwenty {
    public static void main(String[] args){
        float seedlings;
        String inputRowLength;
        float rowLength;
        String inputGridsLength;
        float gridsLength;
        String inputLengthBetweenSeedlings;
        float lengthBetweenSeedlings;

        inputRowLength = JOptionPane.showInputDialog("Podaj długość rzędu w metrach:");
        rowLength = Float.parseFloat(inputRowLength);

        inputGridsLength = JOptionPane.showInputDialog("Podaj ile metrów zajmuje okratowanie:");
        gridsLength = Float.parseFloat(inputGridsLength);

        inputLengthBetweenSeedlings = JOptionPane.showInputDialog("Jaka jest odległość między sadzonkami w metrach?:");
        lengthBetweenSeedlings = Float.parseFloat(inputLengthBetweenSeedlings);

        seedlings = (rowLength - 2*gridsLength)/lengthBetweenSeedlings;

        JOptionPane.showMessageDialog(null,"w jednym rzędzie zmieści się: " + seedlings + " sadzonek");
        System.exit(0);
    }
}

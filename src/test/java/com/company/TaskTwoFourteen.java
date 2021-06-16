package com.company;

import javax.swing.*;

public class TaskTwoFourteen {
    public static void main(String[] args){
        String inputWomen;
        float women;
        String inputMen;
        float men;
        float value;
        float womenPercent;
        float menPercent;

        inputWomen = JOptionPane.showInputDialog("Podaj ilość kobiet uczestniczących w kursie: ");
        women = Float.parseFloat(inputWomen);

        inputMen = JOptionPane.showInputDialog("Podaj ilość mężczyzn uczestniczących w kursie: ");
        men = Float.parseFloat(inputMen);

        value = women + men;

        womenPercent = (women/value) * 100;
        menPercent = (men/value) * 100;

        JOptionPane.showMessageDialog(null, "Odsetek kobiet na kursie wynosi: " + womenPercent + "%" +'\n'
                + "Odsetek mężczyzn na kursie wynosi: " + menPercent + "%");
        System.exit(0);
    }
}

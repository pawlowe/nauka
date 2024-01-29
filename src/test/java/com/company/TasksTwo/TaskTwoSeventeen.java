package com.company.TasksTwo;

import javax.swing.*;

public class TaskTwoSeventeen {
    public static void main (String[] args){
        float sugarOne = (1.5F/48F);
        float butterOne = (1F/48F);
        float flourOne = (2.75F/48F);
        String inputCakes;
        float cakes, sugar, butter, flour;

        inputCakes = JOptionPane.showInputDialog("Podaj ilość ciasteczek jaką chcesz upiec:");
        cakes = Float.parseFloat(inputCakes);

        sugar = sugarOne * cakes;
        butter = butterOne * cakes;
        flour = flourOne * cakes;

        JOptionPane.showMessageDialog(null, "Do upieczenia " + cakes + " ciasteczek potrzebujesz:" + '\n' +
                + sugar + " szklank. cukru" + '\n' + butter + " szklank. masła" + '\n' + flour +
                " szklank. mąki");
        System.exit(0);
    }
}

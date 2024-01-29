package com.company.TasksTwo;

import javax.swing.*;

public class TaskTwoTwelve {
    public static void main(String[] args){
        String inputCity;
        int citySize;
        String bigCity;
        String littleCity;
        char letter;

        inputCity = JOptionPane.showInputDialog("Jakie jest Twoje ulubione miasto?");
        citySize = inputCity.length();
        bigCity = inputCity.toUpperCase();
        littleCity = inputCity.toLowerCase();
        letter = inputCity.charAt(0);

        System.out.println("liczba znaków: " + citySize + '\n'
                + "nazwa wielkimi literami: " + bigCity + '\n'
                + "nazwa małymi literami: " + littleCity + '\n'
                + "pierwsza litera miasta to: " + letter);
    }
}

package com.company;

import javax.swing.*;

public class TaskTwoEighteen {
    public static void main(String[] args){
        String inputName, inputAge, inputCity, inputUniversity, inputOccupation, inputAnimal, inputAname;
        inputName = JOptionPane.showInputDialog("Podaj swoje imię:");
        inputAge = JOptionPane.showInputDialog("Podaj swój wiek:");
        inputCity = JOptionPane.showInputDialog("Podaj nazwę miejscowości w której mieszkasz:");
        inputUniversity = JOptionPane.showInputDialog("Podaj nazwę uczelni na której studiowałeś:");
        inputOccupation = JOptionPane.showInputDialog("Wpisz zawód jaki wykonujesz:");
        inputAnimal = JOptionPane.showInputDialog("Jakie zwierzę lubisz najbardziej?:");
        inputAname = JOptionPane.showInputDialog("Jak byś nazwał swoje ulubione zwierzę");

        JOptionPane.showMessageDialog(null, "Oto Twoja historia:" + '\n' +
                "Pewnego razu żył sobie " + inputName + ", który mieszkał w " + inputCity + ". W wieku " + inputAge +
                " rozpoczął studia na " + inputUniversity + "." + '\n' + inputName + " ukończył studia i rozpoczął pracę jako " +
                inputOccupation + ". Wtedy "+ inputName + " adoptował " + inputAnimal + '\n' + " o imieniu " + inputAname +
                " i żyli sobie długo i szczęśliwie!");
        System.exit(0);
    }
}

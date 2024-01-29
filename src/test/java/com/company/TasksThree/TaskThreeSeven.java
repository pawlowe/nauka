package com.company.TasksThree;

import javax.swing.*;

public class TaskThreeSeven {
    public static void main(String[] args)
    {
        String name1, name2, name3;
        int compare1, compare2, compare3;

        name1 = JOptionPane.showInputDialog("Podaj pierwsze imię");
        name2 = JOptionPane.showInputDialog("Podaj drugię imię");
        name3 = JOptionPane.showInputDialog("Podaj trzecie imię");


        if (name1.compareToIgnoreCase(name2) <=0 && name1.compareToIgnoreCase(name3) <=0 && name2.compareToIgnoreCase(name3) <=0)
        {
            System.out.println( name1 + "\n" + name2 + "\n" + name3);
        }
        else if (name1.compareToIgnoreCase(name2) <=0 && name1.compareToIgnoreCase(name3) <=0 && name2.compareToIgnoreCase(name3) >0)
        {
            System.out.println( name1 + "\n" + name3 + "\n" + name2);
        }
        else if (name1.compareToIgnoreCase(name2) > 0 && name1.compareToIgnoreCase(name3) <=0 && name2.compareToIgnoreCase(name3) <=0)
        {
            System.out.println( name2 + "\n" + name1 + "\n" + name3);
        }
        else if (name1.compareToIgnoreCase(name2) > 0 && name1.compareToIgnoreCase(name3) >0 && name2.compareToIgnoreCase(name3) <=0)
        {
            System.out.println( name2 + "\n" + name3 + "\n" + name1);
        }
        else if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) >0 && name2.compareToIgnoreCase(name3) >0)
        {
            System.out.println( name3 + "\n" + name1 + "\n" + name2);
        }
        else
        {
            System.out.println( name3 + "\n" + name2 + "\n" + name1);
        }
        System.exit(0);
    }
}

package com.company.nauka;

import javax.swing.*;

public class TaskThreeSeventeen {
    public static void main(String[] args){
        String input;

        input = JOptionPane.showInputDialog("Uruchom ponownie komputer i spróbuj nawiązać połączenie." + '\n' + "Czy to rozwiązało problem?");

        if (input.equalsIgnoreCase("nie"))
        {
            input = JOptionPane.showInputDialog("Uruchom ponownie router i spróbuj nawiązać połączenie." + '\n' + "Czy to rozwiązało problem?");
            if (input.equalsIgnoreCase("nie"))
            {
                input = JOptionPane.showInputDialog("Upewnij się, że kable prowadzące do routera i modemu są dobrze zamocowane." + '\n'
                        + "Czy to rozwiązało problem?");
                if (input.equalsIgnoreCase("nie"))
                {
                    input = JOptionPane.showInputDialog("Przenieś router w inne miejsce" + '\n' + "Czy to rozwiązało problem?");
                    if (input.equalsIgnoreCase("nie"))
                    {
                        JOptionPane.showMessageDialog(null, "Kup nowy router.");
                    }
                    else{
                        System.exit(0);
                    }
                }
                else
                {
                    System.exit(0);
                }
            }
            else
            {
                System.exit(0);
            }
        }
        else {
            System.exit(0);
        }
    }
}

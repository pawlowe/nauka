package com.company.TasksFour;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskFourFifteen {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName1, fileName2, lineText, completeFileName1, completeFileName2 ;
        String path = "C:\\Users\\......\\Desktop\\Documenty\\Java\\";

        fileName1 = JOptionPane.showInputDialog("Podaj nazwę 1 pliku");
        fileName2 = JOptionPane.showInputDialog("Podaj nazwę 2 pliku");

        completeFileName1 = path + fileName1;
        completeFileName2 = path + fileName2;

        File file1 = new File(completeFileName1);

        if (!file1.exists()){
            JOptionPane.showMessageDialog(null, "Nie znaleziono pliku " + fileName1);
            System.exit(0);
        }
        else{
            Scanner inputFile1 = new Scanner(file1);
            PrintWriter outputFile = new PrintWriter(completeFileName2);

            while(inputFile1.hasNext())
            {
                lineText = inputFile1.nextLine();
                outputFile.println(lineText.toUpperCase());
            }
            inputFile1.close();
            outputFile.close();
        }
    }
}

package com.company.TasksFour;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TaskFourThirteen {
    public static void main(String [] args) throws IOException {
        String fileName, lineText, completeFileName;
        String path = "C:\\Users\\....\\Desktop\\Documenty\\Java\\";

        fileName = JOptionPane.showInputDialog("Podaj nazwę pliku");

        completeFileName = path + fileName;

        File file = new File(completeFileName);
        if (!file.exists()){
            JOptionPane.showMessageDialog(null, "Nie znaleziono pliku " + fileName);
            System.exit(0);
        }
        else{
            Scanner inputFile = new Scanner(file);
            for (int i = 1; i <=5; i++){
                lineText = inputFile.nextLine();
                System.out.println( i + ": " + lineText);
            }
            inputFile.close();
        }
    }
}

package com.company.TasksFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TaskFourSix {
    public static void main(String[] args) throws IOException {
        String fileName, character, completeFileName;
        String path = "C:\\Users\\...\\Desktop\\";
        int value = 0;

        Scanner keyboard = new Scanner(System.in);
        //comment
        System.out.println("Podaj nazwę pliku:");
        fileName = keyboard.nextLine();
        completeFileName = path + fileName;


        System.out.println("Wprowadź znak który chcesz wyszukać w pliku:");
        character = keyboard.nextLine();

        File file = new File(completeFileName);

        if (!file.exists()) {
            System.out.println("Nie znaleziono pliku o nazwie " + fileName);
            System.exit(0);
        } else {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                String fileSign = inputFile.nextLine();

                for (int i = 0; i < fileSign.length(); i++) {
                    System.out.println(fileSign.charAt(i));
                    char letter = (fileSign.charAt(i));
                    char fileLetter = character.charAt(0);
                    if (letter == fileLetter) {
                        value = value +1;
                    }
                }
            }

            inputFile.close();
            System.out.println("Ilość wystąpień danego znaku w pliku wynosi " + value);
        }
    }
}

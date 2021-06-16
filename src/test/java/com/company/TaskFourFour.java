package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskFourFour {
    public static void main(String[] args) throws IOException {
        String filename = "wypłata";
        int dayValue = 0;
        double daySalary;
        double summarySalary = 0.00;
        int daysInput;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość przepracowanych dni");
        daysInput = keyboard.nextInt();

        while (daysInput < 1) {
            System.out.println("Minimalna ilość przepracowanych dni to 1");
            daysInput = keyboard.nextInt();
        }

        PrintWriter outputFile = new PrintWriter(filename);
        outputFile.println("Dzień  Należna wypłata");
        outputFile.println("---------------------------");

        for (int i= 0; i < daysInput; i++)
        {
            dayValue = i +1;
            daySalary = (Math.pow(2, i))/100;
            summarySalary += daySalary;
            outputFile.println(dayValue  + "  " + daySalary);
        }
        outputFile.printf("Pensja łączna wynosi: %.2f.zł\n", summarySalary);
        outputFile.close();
        System.out.println("Dane zostały zapisane do pliku");
    }
}

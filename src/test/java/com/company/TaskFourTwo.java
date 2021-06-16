package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskFourTwo {
    public static void main(String[] args) throws IOException {
        final double time = 1.0;
        final double velocity = 0.0;
        String filename = "odległość";
        double timeInput, velocityInput;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj prędkosć z jaką poruszał się pojazd w km/h:");
        velocityInput = keyboard.nextDouble();

        while (velocityInput <= velocity)
        {
            System.out.println("Została podana niepoprawna wartość. Predkość nie może być mniejsza lub równa 0. Wpisz poprawną wartość");
            velocityInput = keyboard.nextDouble();
        }

        System.out.println("Podaj czas podróży w godzinach:");
        timeInput = keyboard.nextDouble();

        while (timeInput < time)
        {
            System.out.println("Została podana niepoprawna wartość. Czas nie może być krótszy niż godzina. Podaj poprawną wartość");
            timeInput = keyboard.nextDouble();
        }



        PrintWriter outputFile = new PrintWriter(filename);
        outputFile.println("Godzina  Przebyta odległość");
        outputFile.println("---------------------------");

        for (double i= 1.0; i <= timeInput; i++)
        {
            outputFile.println(i + "             " + i*velocityInput);
        }
        outputFile.close();
        System.out.println("Dane zostały zapisane do pliku");
    }

}

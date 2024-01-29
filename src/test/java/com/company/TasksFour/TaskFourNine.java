package com.company.TasksFour;

import java.util.Scanner;

public class TaskFourNine {
    public static void main(String[] args){
        int organism, percentIncrease, days;
        double daySummary = 0, population = 0 , populationIncrease = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj początkową liczbę organizmów");
        organism = keyboard.nextInt();

        while (organism<2)
            {
                System.out.println("Populacja początkowa nie może być mniejsza niz 2 organizmy");
                organism = keyboard.nextInt();
            }

        System.out.println("Podaj średni dzienny przyrost populacji w %. Wpisz liczbę całkowitą np. 15");
        percentIncrease = keyboard.nextInt();

        while (percentIncrease<=0)
            {
                System.out.println("Przyrost populacji nie może być ujemny");
                percentIncrease = keyboard.nextInt();
            }

        System.out.println("Podaj liczbę dni przez jaką organizmy będą się rozmnażać");
        days = keyboard.nextInt();

        while (days<1)
            {
                System.out.println("Liczba dni rozmnażania nie może być mniejsza niż 1");
                days = keyboard.nextInt();
            }

        for(int i=1; i<=days; i++)
            {
                if (i==1)
                {
                    population = organism;
                }
                else
                {
                    population = daySummary;
                }
                populationIncrease = (population * percentIncrease)/100.00;
                daySummary = population + populationIncrease;

                System.out.println("Liczba populacji na dzień " + i + " wynosi " + daySummary);
            }
    }
}

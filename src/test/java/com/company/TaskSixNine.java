package com.company;

import java.util.Scanner;

public class TaskSixNine {
    public static void main(String[] arg){
        int year, month;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj miesiąc (1-12):");
        month = keyboard.nextInt();
        System.out.println("Podaj rok:");
        year = keyboard.nextInt();

        MonthDays monthDays = new MonthDays(month, year);

        System.out.println("Ten miesiąc ma " + monthDays.numberOfDays());
    }
}

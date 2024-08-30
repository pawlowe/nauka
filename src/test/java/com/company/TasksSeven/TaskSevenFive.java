package com.company.TasksSeven;

import java.util.Scanner;

public class TaskSevenFive {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj dowolną liczbę całkowitą od 1 do 10\n");
        number = keyboard.nextInt();

        searchNumber(number, numbers);

    }

    public static void searchNumber(int userNumber, int[] table){
        System.out.printf("Liczby większe od %s to: \n", userNumber );

        for(int i = 0; i < table.length; i++){
            if (table[i] > userNumber){
                System.out.println(table[i]);
            }
        }
    }
}

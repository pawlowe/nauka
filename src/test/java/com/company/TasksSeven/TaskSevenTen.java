package com.company.TasksSeven;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskSevenTen {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] months = new int[12][];
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        File file = new File("C:\\Users\\Eliza\\Desktop\\pliki java\\tracker.txt");
        Scanner inputFile = new Scanner(file);

        for(int i= 0; i< months.length; i++){
            months[i] = new int[days[i]];
        }

        for(int i=0; i< months.length; i++){
            for(int ii=0; ii< months[i].length; ii++){
                String line = inputFile.nextLine();
                months[i][ii] = Integer.parseInt(line);
            }
        }

        for(int i=0; i< months.length; i++){
            double sum = 0;
            for(int ii=0; ii< months[i].length; ii++){
                sum += months[i][ii];
            }
            double avg = sum/months[i].length;
            System.out.printf("W miesiącu %s zrobiłeś średnio: %.2f kroków.", i+1, avg);
            System.out.println();
        }

    }
}

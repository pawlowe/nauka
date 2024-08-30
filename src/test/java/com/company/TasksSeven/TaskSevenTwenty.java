package com.company.TasksSeven;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TaskSevenTwenty {
    public static Random random = new Random();
    public static void main(String[] args){
        int [][] table;

        table = setTable();
        printTable(table);
        checkSquare(table);
    }

    public static int[][] setTable(){
        int[][] table = new int[3][3];
        ArrayList<Integer> usedValues = new ArrayList<>();
        for(int i=0; i < table.length; i++){
            for (int j=0; j < table[i].length; j++){
                int number;
                do {
                    number = random.nextInt(9) + 1;
                }while (usedValues.contains(number));
                usedValues.add(number);
                table[i][j] = number;
            }
        }
        return table;
    }

    public static void printTable(int[][] table){
        for(int i=0; i < table.length; i++) {
            System.out.println(" _____________");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(" | " + table[i][j]);
            }
            System.out.print(" |" + "\n");
        }
        System.out.println(" _____________");
    }

    public static void checkSquare(int[][] table){
        String loShu;
        for(int i=0; i < table.length; i++){
            int sum = 0;
            for (int j = 0; j < table[i].length; j++){
                sum += table[i][j];
            }
            if (sum == 15){
                loShu = "yes";
            }
            else{
                loShu = "no";
            }
        }
        int first = table[0][0] + table[1][1] + table[2][2];
        int second = table[2][0] + table[1][1] + table[0][2];

        if (first == 15 && second ==15){
            loShu = "yes";
        }
        else{
            loShu = "no";
        }

        if (loShu.equals("yes")){
            System.out.println("Jest to kwadrat Lo Shu");
        }
        else {
            System.out.println("Nie jest to kwadrat Lo Shu");
        }
    }
}

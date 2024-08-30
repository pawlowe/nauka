package com.company.TasksSeven;

import java.util.Arrays;

public class TaskSevenSeventeen {
    public static void main(String[] args) {
        int table[][] = {{5, 8, 9},
                {6, 9, 7},
                {3, 11, 8}};

        System.out.println("Suma wszystkich liczb z tabeli wynosi: " + getTotal(table));
        System.out.printf("Średnia wszystkich liczb z tabeli wynosi: %.2f \n ", getAverage(table));
        System.out.println("Suma wszystkich liczb z 2 wiersza tabeli wynosi: " + getRowTotal(table, 2));
        System.out.println("Suma wszystkich liczb z 1 kolumny wynosi: " + getColumnTotal(table, 1));
        System.out.println("Najwyższa wartość z 3 wiersza tabeli wynosi: " + getHighestInRow(table, 3));
        System.out.println("Najniższa wartość z 1 wiersza tabeli wynosi: " + getLowestInRow(table, 1));

    }

    public static int getTotal(int [][] list){
        int total = 0;
        for (int i = 0; i < list.length; i++){
           total += Arrays.stream(list[i]).sum();
        }
        return total;
    }

    public static double getAverage(int [][] list){
        int listLenght = 0;
        for (int i = 0; i < list.length; i++){
            listLenght += list[i].length;
        }
        return (double)getTotal(list)/listLenght;
    }

    public static double getRowTotal(int [][] list, int row){
        int i = row - 1;
        return Arrays.stream(list[i]).sum();
    }

    public static double getColumnTotal(int [][] list, int col){
        int i = col - 1;
        double total = 0.0;
        for (int j = 0; j < list.length; j++){
            total += list[j][i];
        }
        return  total;
    }

    public static int getHighestInRow(int [][] list, int row) {
        int i = row - 1;
        int highest = list[i][0];
        for (int val : list[i]) {
            if (val >= highest) {
                highest = val;
            }
        }
        return highest;
    }

    public static int getLowestInRow(int [][] list, int row) {
        int i = row - 1;
        int lowest = list[i][0];
        for (int val : list[i]) {
            if (val <= lowest) {
                lowest = val;
            }
        }
        return lowest;
    }
}

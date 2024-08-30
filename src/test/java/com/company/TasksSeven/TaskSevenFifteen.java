package com.company.TasksSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskSevenFifteen {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenFifteen.txt");

        Scanner inputFile = new Scanner(file);

        ArrayList<Integer> valueList = new ArrayList<>();

        while (inputFile.hasNext()){
            valueList.add(inputFile.nextInt());
        }

        System.out.printf("Średnia roczna zmiana zaludnienia woniosła: %.2f osób \n", averageChange(valueList));
        System.out.printf("Rok z największym wzrostem liczby mieszkańców: %s \n", highestIncrease(valueList));
        System.out.printf("Rok z najmniejszym wzrostem liczby mieszkańców: %s \n", highestDecrease(valueList));
    }

    public static double averageChange(ArrayList<Integer> list){
        double average = 0.0;
        int sumOfDifferences = 0;
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i) > list.get(i+1)){
                sumOfDifferences += list.get(i) - list.get(i+1);
            }
            else {
                sumOfDifferences += list.get(i+1) - list.get(i);
            }
        }

        average = (double)sumOfDifferences/(list.size() - 1);

        return average;
    }

    public static Integer highestIncrease(ArrayList<Integer> list){
        int highest = 0, finalYear = 0;
        int year = 1950;
        for (int i = 0; i < list.size() - 1; i++){
            int value = list.get(i) - list.get(i+1);
            if (value > highest){
                highest = value;
                finalYear = year + i+1;
            }
        }
        return finalYear;
    }

    public static Integer highestDecrease(ArrayList<Integer> list){
        int highest = 0, finalYear = 0;
        int year = 1950;
        for (int i = 0; i < list.size() - 1; i++){
            int value = list.get(i) - list.get(i+1);
            if (value < highest){
                highest = value;
                finalYear = year + i+1;
            }
        }
        return finalYear;
    }
}

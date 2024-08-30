package com.company.TasksSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskSevenTwelve {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenTwelve.txt");
        Scanner inputFile = new Scanner(file);

        ArrayList<Double> valueList = new ArrayList<>();

        while (inputFile.hasNext()){
            valueList.add(inputFile.nextDouble());
        }

        TableTwelve tableTwelve = new TableTwelve(valueList);
        System.out.println(tableTwelve.getMinValue());
        System.out.println(tableTwelve.getMaxValue());
        tableTwelve.getAverageMonthValue();
    }
}

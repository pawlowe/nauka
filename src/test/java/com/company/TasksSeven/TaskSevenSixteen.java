package com.company.TasksSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskSevenSixteen {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenSixteen.txt");

        Scanner inputFile = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> valueList = new ArrayList<>();
        String value;
        int times = 0;

        while (inputFile.hasNext()) {
            valueList.add(inputFile.next());
        }

        System.out.println("Podaj nazwę zespołu");

        value = keyboard.next();

        for (int i=0; i < valueList.size(); i++ ){
            if (valueList.get(i).equals(value)){
                times +=1;
            }
        }

        System.out.printf("Drużyna %s, wygrywała mistrzostwa %s razy.", value, times);
    }
}

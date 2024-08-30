package com.company.TasksSeven;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskSevenFourteen {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Eliza\\Desktop\\pliki java\\ImionaMeskie.txt");
        File file2 = new File("C:\\Users\\Eliza\\Desktop\\pliki java\\ImionaZenskie.txt");
        ArrayList<String> womenNames = new ArrayList<>();
        ArrayList<String> menNames = new ArrayList<>();
        String name;
        int option;

        Scanner keyboard = new Scanner(System.in);

        womenNames = createList(file2);
        menNames = createList(file1);

        option = displayOption();

        if (option == 1){
            System.out.println("Podaj imie żeńskie jakie chcesz sprawdzić");
            name = keyboard.next();
            boolean check = true;
            for (String value : womenNames){
                check = checkValue(name, value);
                if (check){
                    System.out.println("Brawo wpisane imie występuje na liście popularnych imion żeńskich!");
                    break;
                }
            }

           if(!check) {
               System.out.println("Niestety podane imie nie widnieje na liście poppularnych imion żeńskich.");
           }
        }
        else if (option == 2){
            System.out.println("Podaj imie męskie jakie chcesz sprawdzić");
            name = keyboard.next();
            boolean check = true;
            for (String value : menNames){
                check = checkValue(name, value);
                if (check){
                    System.out.println("Brawo wpisane imie występuje na liście popularnych imion!");
                    break;
                }
            }
            if(!check) {
                System.out.println("Niestety podane imie nie widnieje na liście poppularnych imion męskich.");
            }
        }
        else {
            System.out.println("Podaj imie jakie chcesz sprawdzić");
            name = keyboard.next();
            boolean check = true;
            for (String value : womenNames){
                check = checkValue(name, value);
                if (check){
                    System.out.println("Brawo wpisane imie występuje na liście popularnych imion żeńskich!");
                    break;
                }
            }
            if (!check){
                System.out.println("Imie nie występuje na liście popularnych imion żeńskich.");
            }
            for (String value : menNames){
                check = checkValue(name, value);
                if (check){
                    System.out.println("Brawo wpisane imie występuje na liście popularnych imion męskich!");
                    break;
                }
            }
            if(!check){
                System.out.println("Imie nie występuje na liście popularnych imion męskich.");
            }
        }

    }

    public static ArrayList<String> createList(File filePath) throws FileNotFoundException {
        ArrayList<String> valueList = new ArrayList<>();
        Scanner inputFile = new Scanner(filePath);
        while (inputFile.hasNext()){
            valueList.add(inputFile.next());
        }
        return valueList;
    }

    public static int displayOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Jeśli chcesz sprawdzić najpopularniejsze imiona:\n żeńskie - wpisz 1 \n meskie - wpisz 2 \n" +
                "obie opcje - wpisz 3 ");
        return keyboard.nextInt();
    }

    public static boolean checkValue(String name, String tableName){
        if (name.equalsIgnoreCase(tableName)){
            return true;
        }
        else{
            return false;
        }
    }
}

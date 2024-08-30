package com.company.TasksSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TaskSevenSeven {
    private String fileName = "C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenSeven.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        String question, play;

        do{
            System.out.println("Witamy w programie magiczna kula. Zadaj zamknięte pytanie i sprawdź co Cię czeka " +
                    "w przyszłości!");
            question = keyboard.nextLine();

            System.out.println("Odpowiedź na Twoje pytanie: \n" + question + "\nBrzmi:");
            System.out.println(getAnswer());

            System.out.println("Czy chcesz zadań kolejne pytanie? Wpisz tak, jeśli chcesz kontynuować zabawę.");
            play = keyboard.nextLine();

        }while(play.equalsIgnoreCase("tak"));
    }

    public static ArrayList getAnswers() throws FileNotFoundException {
        String fileName = "C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenSeven.txt";

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        ArrayList<String> answerList = new ArrayList<String>();
        do {
            String answer = scanner.nextLine();
            answerList.add(answer);
        }while(scanner.hasNext());
        scanner.close();
        return answerList;
    }

    public static String getAnswer() throws FileNotFoundException {
        Random random = new Random();
        int i = random.nextInt(getAnswers().size()-1);
        return (String) getAnswers().get(i);
    }
}

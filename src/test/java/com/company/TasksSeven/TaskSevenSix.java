package com.company.TasksSeven;

import java.util.Scanner;

public class TaskSevenSix {
    public static void main(String[] args){
        final int MAX_TABLE_LENGTH = 20;
        String[] userAnswers = new String[MAX_TABLE_LENGTH];
        int[] skipQuestions;
        String answer;
        boolean passed;

        Scanner keyboard = new Scanner(System.in);

        for(int i=0; i <MAX_TABLE_LENGTH; i++){
            System.out.printf("Podaj adopowiedż na pytanie %s. Jeśli nie znasz odpowiedzi i chcesz pominąć pytanie" +
                    "wpisz 0\n", i+1);
            answer = keyboard.next();

            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")
                    && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D")
                    && !answer.equalsIgnoreCase("0"))
            {
                System.out.printf("Nie ma takiej odpowiedzi. Podaj odpowiedź na pytanie %s\n", i);
                answer = keyboard.next();
            }
            userAnswers[i] = answer;
        }

        DriverExam driverExam = new DriverExam(userAnswers);

        System.out.println("Udzieliłeś " + driverExam.totalCorrect() + " poprawnych odpowiedzi.");
        System.out.println("Udzieliłeś " + driverExam.totalIncorrect() + " niepoprawnych odpowiedzi.");
        System.out.println("Nie udzieliłeś odpowiedzi na następujące pytania: ");

        skipQuestions = driverExam.getQuestionMissed();
        for (int i=0; i < skipQuestions.length; i++){
            if(skipQuestions[i] != 0){
                System.out.println(skipQuestions[i]);
            }
        }

        passed = driverExam.passed(driverExam.totalCorrect());
        if(passed){
            System.out.println("Gratulację zdałeś egzamin");
        }
        else{
            System.out.println("Niestety tym razem nie udało Ci się zdać egzaminu.");
        }
    }
}

package com.company.TasksSix;

import java.util.Scanner;

public class TaskSIxSix {
    public static void main(String[] args) {
        TestScores testScores = new TestScores();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź wyniki testów: ");
        testScores.setTestScores(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());

        System.out.println("Srednia z testów wynosi: " + testScores.getAverage());
    }
}

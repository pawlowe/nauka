package com.company.TasksSeven;

import java.util.Scanner;

public class Oceny {
    private final int TABLE_SIZE = 5;
    private final int TABLE_ITEMS = 4;

    Scanner keyboard = new Scanner(System.in);

    String [] students;
    int [] note;
    double [][] testResults;

    public Oceny(){
        students = new String[TABLE_SIZE];
        note = new int[TABLE_SIZE];
        testResults = new double[TABLE_SIZE][TABLE_ITEMS];
    }

    public void setStudentsResults(){
        for (int i =0; i < TABLE_SIZE; i++){
            int student = i + 1;
            System.out.println("Wpisz imię i nazwisko studenta nr " + student);
            students[i] = keyboard.next();

            for (int x = 0; x < TABLE_ITEMS; x++){
                int test = x + 1;
                System.out.println("Podaj wynik studenta z testu nr " + test);
                double points;
                points = keyboard.nextDouble();

                while(points < 0 || points > 100){
                    System.out.println("Podano niepoprawną wartość. Wpisz poprawną wartość.");
                    points = keyboard.nextDouble();
                }
                testResults[i][x] = points;
            }

            note[i] = setNote(getAverageTestsPoints(i));
        }
    }

    private String getStudent(int studentID){
        return students[studentID];
    }

    private double getAverageTestsPoints(int studentID){
       double sum=0.0;
       double min=100.0;
       for (int i=0; i<TABLE_ITEMS; i++){
           sum += testResults[studentID][i];
           if (testResults[studentID][i]<min){
               min=testResults[studentID][i];
           }
        }
       return (sum-min)/((double)TABLE_ITEMS-1);
    }

    private int setNote(double averagePoints){
        if(averagePoints <60){
            return 1;
        }
        else if (averagePoints >= 60 && averagePoints <70){
            return 2;
        }
        else if (averagePoints >= 70 && averagePoints <80){
            return 3;
        }
        else if (averagePoints >= 80 && averagePoints <90){
            return 4;
        }
        else {
            return 5;
        }
    }

    private int getNote(int studentID){
        return note[studentID];
    }

    public void getStudentsResults(){
        System.out.println("Student " + "\t" + "Średnia z testów" + "\t" + "Ocena");
        for (int i = 0; i<TABLE_SIZE; i++){
            System.out.println(getStudent(i) + "\t" + getAverageTestsPoints(i) + "\t" + getNote(i));
        }
    }
}

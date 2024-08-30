package com.company.TasksSeven;

import java.util.Random;
import java.util.Scanner;

public class TaskSevenNineteen {

    static Random random = new Random();
    static Question question = new Question();

    public static void main(String[] args) {
        int firstPlayer, secondPlayer;


        firstPlayer = round();
        secondPlayer = round();

        if (firstPlayer > secondPlayer){
            System.out.println("Wygrał gracz nr 1");
        }
        else if (firstPlayer < secondPlayer){
            System.out.println("Wygrał gracz nr 2");
        }
        else {
            System.out.println("Tym razem nikt nie wygrał jest remis.");
        }

    }

    public static int round(){
        int score = 0;
        System.out.println("Witaj w grze matematycznej. Za chwilę zobaczysz 5 pytań, na które będziesz musiał udzielić odp.");
        for (int i=1; i <=5; i++){
            System.out.println("Pytanie nr " + i);
            question.setQuestionRound();
            System.out.println(question.getQuestionRound());
            System.out.println("Twoja odpowiedź to: ");
            int value = random.nextInt(5);
            String response = getResponse(value);
            System.out.println(response);
            score += question.checkResult(response);
        }

        return score;
    }

    public static String getResponse(int value){
        switch (value){
            case 1:
                return question.getAnswer1();
            case 2:
                return question.getAnswer2();
            case 3:
                return question.getAnswer3();
            default:
                return question.getAnswer4();
        }
    }
}

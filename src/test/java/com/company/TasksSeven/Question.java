package com.company.TasksSeven;

import java.util.ArrayList;
import java.util.Random;

public class Question {
    private String question, answer1, answer2, answer3, answer4, correctAnswer;
    private ArrayList<Integer> usedQuestions = new ArrayList<>();
    private int questionNumber;
    Random random = new Random();
    private String[][] questions = {{"Ile to jest 2+2", "4", "5", "1", "2", "4"},
                                    {"Ile to jest 2*2", "1", "2", "4", "5", "4"},
                                    {"Ile to jest 2:2", "4", "3", "2", "1", "1"},
                                    {"Ile to jest 2-2", "2", "1", "0", "-1", "0"},
                                    {"Ile to jest 3+3", "3", "4", "5", "6", "6"},
                                    {"Ile to jest 3*3", "3", "6", "9", "12", "9"},
                                    {"Ile to jest 3:3", "3", "2", "1", "0", "1"},
                                    {"Ile to jest 3-3", "3", "2", "1", "0", "0"},
                                    {"Ile to jest 5*5", "5", "15", "20", "25", "25" },
                                    {"Ile to jest 3*5", "3", "5", "8", "15", "15"}};

    public Question(){
        this.question = "";
        this.answer1 = "";
        this.answer2 = "";
        this.answer3 = "";
        this.answer4 = "";
        this.correctAnswer = "";
        this.questionNumber = -1;
    }

    public void setQuestionRound(){
        setQuestionNumber();
        setQuestion();
        setAnswer1();
        setAnswer2();
        setAnswer3();
        setAnswer4();
        setCorrectAnswer();
    }

    public String getQuestionRound(){
        String round = getQuestion() + "\n" + getAnswer1() + "\t" + getAnswer2() + "\t"
                + getAnswer3() + "\t" + getAnswer4() ;
        return round;
    }

    public int checkResult(String answer){
        if(answer.equals(getCorrectAnswer())){
            System.out.println("Gratulacje to poprawna odpowiedź!");
            return 1;
        }
        else{
            System.out.println("Niestety tym razem Ci się nie udało. Poprawna odpowiedź to " + getCorrectAnswer());
            return 0;
        }
    }

    private void setQuestionNumber(){
        do {
            this.questionNumber = this.random.nextInt(10);
        }while (this.usedQuestions.contains(this.questionNumber));

        this.usedQuestions.add(this.questionNumber);
    }

    private void setQuestion(){
        this.question = this.questions[this.questionNumber][0];
    }

    private void setAnswer1(){
        this.answer1 = this.questions[this.questionNumber][1];
    }

    private void setAnswer2(){
        this.answer2 = this.questions[this.questionNumber][2];
    }

    private void setAnswer3(){
        this.answer3 = this.questions[this.questionNumber][3];
    }

    private void setAnswer4(){
        this.answer4 = this.questions[this.questionNumber][4];
    }

    private void setCorrectAnswer(){
        this.correctAnswer = this.questions[this.questionNumber][5];
    }

    private String getQuestion(){
        return question;
    }

    public String getAnswer1(){
        return this.answer1;
    }

    public String getAnswer2(){
        return this.answer2;
    }

    public String getAnswer3(){
        return this.answer3;
    }

    public String getAnswer4(){
        return this.answer4;
    }

    private String getCorrectAnswer(){
        return this.correctAnswer;
    }
}


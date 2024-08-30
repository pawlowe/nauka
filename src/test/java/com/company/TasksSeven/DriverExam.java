package com.company.TasksSeven;

public class DriverExam {
    final int MAX_TABLE_LENGTH = 20;
    int correct, incorrect;
    int[] questionMissed = new int[MAX_TABLE_LENGTH];
    String[] answersFromUser;
    String[] correctAnswers = {"B", "D", "A", "A", "C",
            "A", "B", "A", "C", "D",
            "B", "C", "D", "A", "D",
            "C", "C", "B", "D", "A"};

    public DriverExam(String[] answers){
        answersFromUser = answers;
        correct = 0;
        incorrect = 0;
    }

    public boolean passed(int correctAnswers){
        if(correctAnswers >= 15){
            return true;
        }
        else{
            return false;
        }
    }

    public int totalCorrect(){
        for(int i=0; i< answersFromUser.length; i++){
            if(answersFromUser[i].equalsIgnoreCase(correctAnswers[i])){
                correct+=1;
            }
        }
        return correct;
    }

    public int totalIncorrect(){
        for(int i=0; i< answersFromUser.length; i++){
            if(!answersFromUser[i].equalsIgnoreCase(correctAnswers[i])){
                incorrect+=1;
            }
        }
        return incorrect;
    }

    public int[] getQuestionMissed(){
        for(int i=0; i< answersFromUser.length; i++){
            if(answersFromUser[i].equals("0")){
                questionMissed[i] = i;
            }
        }
        return questionMissed;
    }
}

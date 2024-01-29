package com.company.TasksFour;

import java.util.Random;

public class TaskFourTwentyOne {
    public static void main(String[] args){
        int playerToss, computerToss, scoreP = 0, scoreC = 0;

        Random number = new Random();

        for (int i=1; i<=10; i++){
            computerToss = number.nextInt(5) +1;
            playerToss = number.nextInt(5) +1;
            if (computerToss > playerToss){
                scoreC +=1;
                System.out.println("Tą rundę wygrywa komputer");
            }
            else if (playerToss > computerToss){
                scoreP +=1;
                System.out.println("Tą rundę wygrywa gracz");
            }
            else{
                System.out.println("W tej rundzie jest remis");
            }
        }
        if (scoreP > scoreC){
            System.out.println("Gratulacje! Wygrałeś");
        }
        else if (scoreC > scoreP){
            System.out.println("Niestety tym razem wygrywa komputer.");
        }
        else {
            System.out.println("Remis!");
        }
    }
}

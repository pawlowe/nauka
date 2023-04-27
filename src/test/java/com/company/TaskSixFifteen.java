package com.company;

public class TaskSixFifteen {
    public static void main(String[] args){
        int side = 6;
        int computer = 0, valueComputer;
        int user = 0, valueUser;

        Die die1 = new Die(side);
        Die die2 = new Die(side);

        for(int i = 1; i <=10; i++){
            die1.roll();
            valueUser = die1.getValue();
            System.out.println(valueUser);
            die2.roll();
            valueComputer = die2.getValue();
            System.out.println(valueComputer);
            if(valueUser > valueComputer) {
                user += 1;
            }
            else if(valueComputer > valueUser){
                computer += 1;
                }
            else{
                System.out.println("Remis");
            }
        }

        System.out.println("Wyniki całej gry: ");
        System.out.println("Wygrane uzytkownika: " + user);
        System.out.println("Wygrane komputera: " + computer);
        if (user>computer){
            System.out.println("Całą grę wygrywa użytkownik!");
        }
        else if(computer>user){
            System.out.println("Cłą grę wygrywa komputer!");
        }
        else{
            System.out.println("Gratulacje REMIS!");
        }
    }
}

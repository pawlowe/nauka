package com.company;

public class TaskSixSeventeen {
    public static void main(String[] args){
        int reverse = 0;
        int averse = 0;
        String value;

        Coin coin = new Coin();

        System.out.println("Widoczna strona monety na start: " + coin.getSideUp());

        for(int i = 1; i <=20; i++){
            coin.toss();
            value = coin.getSideUp();
            System.out.println("Widoczna strona monety: " + value);
            if(value.equals("orzeł")){
                reverse += 1;
            }
            else{
                averse +=1;
            }
        }

        System.out.println("Orzeł wypadł: " + reverse + "razy");
        System.out.println("Reszka wypadła: " + averse + "razy");
    }
}

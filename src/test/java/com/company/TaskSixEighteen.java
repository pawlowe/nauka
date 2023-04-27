package com.company;

public class TaskSixEighteen {
    public static void main(String[] args){
        double value = 0.0;
        String side5, side10, side20;

        Coin coin5 = new Coin();
        Coin coin10 = new Coin();
        Coin coin20 = new Coin();

        do{
            coin5.toss();
            side5 = coin5.getSideUp();
            if (side5.equals("orzeł")){
                value += 0.05;
                System.out.println(value);
            }
            else{
                System.out.println(coin5.getSideUp());
            }
            coin10.toss();
            side10 = coin10.getSideUp();
            if (side10.equals("orzeł")){
                value += 0.1;
                System.out.println(value);
            }
            else{
                System.out.println(coin10.getSideUp());
            }
            coin20.toss();
            side20 = coin20.getSideUp();
            if (side20.equals("orzeł")){
                value += 0.2;
                System.out.println(value);
            }
            else{
                System.out.println(coin20.getSideUp());
            }
        } while(value <= 1.0);

        if (value == 1.0){
            System.out.println("Gratulacje wygrałeś !" + value);
        }
        else{
            System.out.println("Niestety przegrałeś! " + value);
        }
    }
}

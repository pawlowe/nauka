package com.company.TasksSix;

public class RoulettePocket {
    private int number;
    private String color;

    public RoulettePocket(String str){
        number = Integer.parseInt(str);
    }

    public RoulettePocket(int Value){
        number = Value;
    }

    public int getNumber(){
        return number;
    }

    public String getPocketColor(){
        if(getNumber()>0 && getNumber()<=10){
            if (getNumber()%2==0){
                color = "czarny";
            }
            else{
                color = "czerwony";
            }
        }
        else if(getNumber()>10 && getNumber()<=18){
            if (getNumber()%2==0){
                color = "czerwone";
            }
            else{
                color = "czarne";
            }
        }
        else if(getNumber()>18 && getNumber()<=28){
            if (getNumber()%2==0){
                color = "czarne";
            }
            else{
                color = "czerwone";
            }
        }
        else if(getNumber()>28 && getNumber()<=36){
            if (getNumber()%2==0){
                color = "czerwone";
            }
            else{
                color = "czarne";
            }
        }
        else{
            color = "zielony";
        }
        return color;
    }
}

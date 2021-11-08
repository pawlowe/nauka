package com.company;

public class TaskFourEleven {
    public static void main(String[] args){
        double degreaseCentigrade, Fahrenheit;

        System.out.println("C     " + "F");
        for (degreaseCentigrade = 0 ; degreaseCentigrade <=20; degreaseCentigrade++)
        {
            Fahrenheit = ((9/5)*degreaseCentigrade) + 32;

            System.out.println(degreaseCentigrade + " = " + Fahrenheit);
        }
    }
}

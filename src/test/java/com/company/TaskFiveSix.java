package com.company;

public class TaskFiveSix {
    public static void main(String[] args)
    {
        for(int f = 0; f<=20; f++)
        {
            double degreesCentigrade = celsius(f);
            System.out.printf("%s stopni Fahrenheit'a to %.2f stopni Celcjusza. \n", f, degreesCentigrade);
        }
    }

    /**
     * Przeliczanie stopni Fahrenheita na Celcjusza
     * @param valueF - temperatura w stopniach F
     * @rerutn valueC - temperatura w C
     */

    public static double celsius(double valueF)
    {
       double valueC = (5.0/9.0)*(valueF-32);
       return valueC;
    }
}

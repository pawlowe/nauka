package com.company;

public class TestScores {
    private int test1;
    private int test2;
    private int test3;
    private double average;

    public TestScores(){
        test1 = 0;
        test2 = 0;
        test3 = 0;
        average = 0;
    }

    public void setTestScores(int fTest, int sTest, int tTest){
        test1 = fTest;
        test2 = sTest;
        test3 = tTest;
    }

    public double getAverage(){
        average = (test1 + test2 + test3)/3;
        return average;
    }

}

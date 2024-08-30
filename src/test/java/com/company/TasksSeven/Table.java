package com.company.TasksSeven;

public class Table {

    public int getTotal(int[] table){
        int total = 0;
        for( int i = 0; i < table.length; i++){
            total += table[i];
        }
        return total;
    }

    public double getAverage(int[] table){
        return (double)getTotal(table)/table.length;
    }

    public int getHighest(int[] table){
        int value = table[0];
        for (int i=1; i <table.length; i++){
            if(table[i]>value){
                value = table[i];
            }
        }
        return value;
    }

    public int getLowest(int[] table){
        int value = table[0];
        for (int i=1; i <table.length; i++){
            if(table[i]<value){
                value = table[i];
            }
        }
        return value;
    }
}

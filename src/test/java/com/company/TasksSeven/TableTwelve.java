package com.company.TasksSeven;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TableTwelve {
    private double minValue, maxValue;
    ArrayList<Double> doubles = new ArrayList<>();
    double [][] months = new double[12][];

    public TableTwelve(ArrayList<Double> list){
       doubles = list;
       minValue = list.get(0);
       maxValue = list.get(0);
       months = setTable();
    }

    public double getMinValue(){
        for (int i = 0; i < doubles.size(); i++ ){
            if (minValue > doubles.get(i)){
                minValue = doubles.get(i);
            }
        }
        return minValue;
    }

    public double getMaxValue(){
        for (int i = 0; i < doubles.size(); i++ ){
            if (maxValue < doubles.get(i)){
                maxValue = doubles.get(i);
            }
        }
        return maxValue;
    }

    public void getAverageMonthValue(){
        setAverageMonthValue();
        for (int i = 0; i < months.length; i++){
            double value = 0;
            for (int j = 0; j < months[i].length; j++){
                value += months[i][j];
            }
            double average = value/months[i].length;
            System.out.printf("Średnia wartość dla miesiąc %s wynosi %s.\n", i + 1, average);
        }
    }

    public void setAverageMonthValue(){
        for (int i = 0; i < doubles.size(); i++){
            if( i < 4){
                addMonthValues(0, i);
            }
            else if (i >=4 && i < 8) {
                addMonthValues(1, i);
            }
            else if (i >=8 && i < 13) {
                addMonthValues(2, i);
            }
            else if (i >=13 && i < 17) {
                addMonthValues(3, i);
            }
            else if (i >= 17 && i < 22) {
                addMonthValues(4, i);
            }
            else if (i >= 22 && i < 26) {
                addMonthValues(5, i);
            }
            else if (i >= 26 && i < 30) {
                addMonthValues(6, i);
            }
            else if (i >= 30 && i < 35) {
                addMonthValues(7, i);
            }
            else if (i >= 35 && i < 39) {
                addMonthValues(8, i);
            }
            else if (i >=39 && i < 44) {
                addMonthValues(9, i);
            }
            else if (i >= 44 && i < 48) {
                addMonthValues(10, i);
            }
            else {
                addMonthValues(11, i);
            }
        }
    }

    private double[][] setTable(){
        months[0] = new double[4];
        months[1] = new double[4];
        months[2] = new double[5];
        months[3] = new double[4];
        months[4] = new double[5];
        months[5] = new double[4];
        months[6] = new double[4];
        months[7] = new double[5];
        months[8] = new double[4];
        months[9] = new double[5];
        months[10] = new double[4];
        months[11] = new double[4];
        return months;
    }

    private void addMonthValues(int monthIndex, int weekIndex){
        for(int i = 0; i < months[monthIndex].length; i ++){
            months[monthIndex][i] = doubles.get(weekIndex);
        }
    }
}

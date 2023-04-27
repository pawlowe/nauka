package com.company;

public class Procedure {
    private String examination;
    private String date;
    private String examiner;
    private double fee;

    public Procedure(){
        examination = "";
        date = "";
        examiner = "";
        fee = 0;
    }

    public void setExamination(String valueExamination){
        examination = valueExamination;
    }

    public void setDate(String valueDate){
        date = valueDate;
    }

    public void setExaminer(String valueExaminer){
        examiner = valueExaminer;
    }

    public void setFee(String valueFee){
        fee = Double.parseDouble(valueFee);
    }

    public String getExamination(){
        return examination;
    }

    public String getDate(){
        return date;
    }

    public String getExaminer(){
        return examiner;
    }

    public double getFee(){
        return fee;
    }
}

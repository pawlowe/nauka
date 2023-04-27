package com.company;

public class Payroll {
    private String name;
    private String surname;
    private int id;
    private int hours;
    private double wages;
    private double salary;

    public Payroll(){
        name = "";
        surname = "";
        id = 0;
        hours = 0;
        wages = 0;
        salary = 0;
    }

    public void setName(String userName){
        name = userName;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String userSurname){
        surname = userSurname;
    }

    public String getSurname(){
        return surname;
    }

    public void setId(int userId){
        id = userId;
    }

    public int getId(){
        return id;
    }

    public void setHours(int userHours){
        hours = userHours;
    }

    public int getHours(){
        return hours;
    }

    public void setWages(double userWages){
        wages = userWages;
    }

    public double getWages (){
        return wages;
    }

    public void setSalary(){
        salary = getHours() * getWages();
    }

    public double getSalary(){
        return salary;
    }
}

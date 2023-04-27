package com.company;

public class SavingsAccount {
    private double yearPercent;
    private double depositBalance;

    public SavingsAccount(){
        depositBalance = 0.0;
        yearPercent = 0.0;
    }

    public SavingsAccount(String str, String perc){
        depositBalance = Double.parseDouble(str);
        yearPercent = Double.parseDouble(perc)/100;
    }

    public SavingsAccount(double startBalance, double percent){
        depositBalance = startBalance;
        yearPercent = percent/100;
    }

    public double deposit(String str){
        depositBalance += Double.parseDouble(str);
        return Double.parseDouble(str);
    }

    public double deposit(double amount){
        depositBalance += amount;
        return amount;
    }

    public double withdraw(String str){
        depositBalance -= Double.parseDouble(str);
        return Double.parseDouble(str);
    }

    public double withdraw(double amount){
        depositBalance -= amount;
        return amount;
    }

    public double interest(String months){
        double value;
        value = (yearPercent/Integer.parseInt(months)) * depositBalance;
        depositBalance += value;
        return value;
    }

    public double interest(int months){
        double value;
        value = (yearPercent/months) * depositBalance;
        depositBalance += value;
        return value;
    }

    public double getDepositBalance(){
        return depositBalance;
    }
}

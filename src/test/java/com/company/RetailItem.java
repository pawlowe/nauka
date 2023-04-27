package com.company;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(){
        description = "";
        unitsOnHand = 0;
        price = 0.0;
    }

    public void setDescription(String product){
        description = product;
    }

    public void setUnitsOnHand(int number){
        unitsOnHand = number;
    }

    public void setPrice(double value){
        price = value;
    }

    public String getDescription(){
        return description;
    }

    public int getUnitsOnHand(){
        return unitsOnHand;
    }

    public double getPrice(){
        return price;
    }
}

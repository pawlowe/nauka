package com.company;

import javax.swing.*;

public class TaskThreeEight {
    public static void main(String[] args){
        float retailPrice = 99F;
        String inputValue;
        float commodityNumber;
        float discount;
        float discountBase;
        float discountValue;
        float finalPrice;

        inputValue = JOptionPane.showInputDialog("Ile pakietów chcesz zakupić?");
        commodityNumber = Float.parseFloat(inputValue);

        if (commodityNumber < 10)
        {
            discount = 0;
        }
        else if (commodityNumber >= 10 && commodityNumber < 20)
        {
            discount = 0.2F;
        }
        else if (commodityNumber >= 20 && commodityNumber < 50)
        {
            discount = 0.3F;
        }
        else if (commodityNumber >= 50 && commodityNumber < 100)
        {
            discount = 0.4F;
        }
        else
        {
            discount = 0.5F;
        }

        discountBase = commodityNumber * retailPrice;
        discountValue = discountBase * discount;
        finalPrice = discountBase - discountValue;

        JOptionPane.showMessageDialog(null,"Naliczony rabat wynosi: " + discountValue + '\n' + "Kwota do zapłaty wynosi: " +
                finalPrice);
        System.out.println(discount);

        System.exit(0);
    }
}

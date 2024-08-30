package com.company.TasksSeven;

import java.util.ArrayList;


public class TaskSevenEighteen {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        PhoneBookEntry phoneBookEntry1 = new PhoneBookEntry();
        PhoneBookEntry phoneBookEntry2 = new PhoneBookEntry();
        PhoneBookEntry phoneBookEntry3 = new PhoneBookEntry();
        PhoneBookEntry phoneBookEntry4 = new PhoneBookEntry();
        PhoneBookEntry phoneBookEntry5 = new PhoneBookEntry();

        phoneBookEntry1.setName("Kowalski");
        phoneBookEntry1.setPhoneNumber("789987897");
        phoneBookEntry2.setName("Nowak");
        phoneBookEntry2.setPhoneNumber("567765658");
        phoneBookEntry3.setName("Adamiak");
        phoneBookEntry3.setPhoneNumber("123321231");
        phoneBookEntry4.setName("Pawlak");
        phoneBookEntry4.setPhoneNumber("345543453");
        phoneBookEntry5.setName("Lasocki");
        phoneBookEntry5.setPhoneNumber("674532098");

        list.add(phoneBookEntry1.getName()+ " " + phoneBookEntry1.getPhoneNumber());
        list.add(phoneBookEntry2.getName()+ " " + phoneBookEntry2.getPhoneNumber());
        list.add(phoneBookEntry3.getName()+ " " + phoneBookEntry3.getPhoneNumber());
        list.add(phoneBookEntry4.getName()+ " " + phoneBookEntry4.getPhoneNumber());
        list.add(phoneBookEntry5.getName()+ " " + phoneBookEntry5.getPhoneNumber());

        for(String val : list){
            System.out.println(val);
        }

    }
}

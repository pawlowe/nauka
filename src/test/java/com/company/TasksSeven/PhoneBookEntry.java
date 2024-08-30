package com.company.TasksSeven;

public class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    public PhoneBookEntry(){
        name = "";
        phoneNumber = "";
    }

    public void setName(String nameValue){
        this.name = nameValue;
    }

    public void setPhoneNumber(String phoneNumberValue){
        this.phoneNumber = phoneNumberValue;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}

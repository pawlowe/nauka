package com.company.TasksSix;

public class Patient {
    private String name;
    private String address;
    private String phone;
    private String contact;

    public Patient(){
        name = "";
        address = "";
        phone = "";
        contact = "";
    }

    public void setName(String valueName){
        name = valueName;
    }

    public void setAddress(String valeAddress){
        address = valeAddress;
    }

    public void setPhone(String valuePhone){
        phone = valuePhone;
    }

    public void setContact(String valueContact){
        contact = valueContact;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getContact(){
        return contact;
    }
}

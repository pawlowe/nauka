package com.company;

public class PersonalData {
    private String name;
    private String surname;
    private String address;
    private int age;
    private String phone;

    public PersonalData(String nam, String sur, String add, int ag, String pho){
        name = nam;
        surname = sur;
        address = add;
        age = ag;
        phone = pho;
    }

    public void setName(String nam){
        name = nam;
    }

    public void setSurname(String userSurname){
        surname = userSurname;
    }

    public void setAddress(String userAddress){
        address = userAddress;
    }

    public void setAge(int userAge){
        age = userAge;
    }

    public void setPhone(String telephone){
        phone = telephone;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    public String getPhone(){
        return phone;
    }
}

package com.company.TasksSix;

public class Pet {
    private String name;
    private String animal;
    private int age;

    /**
     * Metoda setName
     * @param n imię zwierzaka
     */

    public void setName(String n){
        name = n;
    }

    /**
     * Metoda setAnimal
     * @param a gatunek zwierzaka
     */

    public void setAnimal(String a){
        animal = a;
    }
    /**
     * Metoda setAge
     * @param a wiek zwierzaka
     */

    public void setAge(int a){
        age = a;
    }

    /**
     * Metoda getName
     * @return imię zwierzaka
     */

    public String getName(){
        return name;
    }

    /**
     * Metoda getAnimal
     * @return gatunek zwierzaka
     */

    public String getAnimal(){
        return animal;
    }
    /**
     * Metoda setAge
     * @return wiek zwierzaka
     */

    public int getAge(){
        return age;
    }
}

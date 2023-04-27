package com.company;

public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    /**
     * Konstruktor ustawia początkowe wartości pól
     */
    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }

    /**
     * Ten konstruktor ustawia początkowe wartości pól
     * na podstawie wartości przekazanych jako argumenty
     * @eName - imię i nazwosko pracownika
     * @id - identyfikator pracownika
     * @dep - nazwa działu w którym pracuje dany pracownik
     * @posit - stanowisko na którym pracuje pracownik
     */
    public Employee(String eName, int id, String dep, String posit){
        name = eName;
        idNumber = id;
        department = dep;
        position = posit;
    }

    /**
     * Ten konstruktor ustawia początkowe wartości pól
     * @nameE - imię i nazwosko pracownika przekazane jako argument
     * @iD - identyfikator pracownika przekazany jako argument
     * Nazwa działu w którym pracuje dany pracownik jako pusty ciąg znaków
     * Stanowisko na którym pracuje pracownik jako pusty ciąg znaków
     */
    public Employee(String nameE, String iD){
        name = nameE;
        idNumber = Integer.parseInt(iD);
        department = "";
        position = "";
    }

    /**
     * Metoda pozwala zmienić imię
     * @param nam Imię i nazwisko pracownika
     */
    public void setName(String nam){
        name = nam;
    }

    /**
     * Metoda pozwala zmienić numerID
     * @param num numer ID pracownika
     */
    public void setIdNumber(int num){
        idNumber = num;
    }

    /**
     * Metoda pozwala zmienić departament
     * @param dep departament pracownika
     */
    public void setDepartment(String dep){
        department = dep;
    }

    /**
     * Metoda pozwala zmienić stanowisko
     * @param pos stanowisko pracownika
     */
    public void setPosition(String pos){
        position = pos;
    }

    /**
     * Metoda zwraca imię i nazwisko pracownika
     * @return imię i nazwisko pracownika
     */
    public String getName(){
        return name;
    }

    /**
     * Metoda zwraca numer ID pracownika
     * @return numer ID pracownika
     */
    public int getIdNumber(){
        return idNumber;
    }

    /**
     * Metoda zwraca departament pracownika
     * @return departament pracownika
     */
    public String getDepartment(){
        return department;
    }

    /**
     * Metoda zwraca stanowisko pracownika
     * @return stanowisko pracownika
     */
    public String getPosition(){
        return position;
    }
}

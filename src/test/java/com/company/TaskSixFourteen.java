package com.company;

public class TaskSixFourteen {
    public static void main(String[] args){
        Patient patient = new Patient();
        Procedure procedure1 = new Procedure();
        Procedure procedure2 = new Procedure();
        Procedure procedure3 = new Procedure();

        patient.setName("Jan Nowak");
        patient.setAddress("ul. Matejki 3, 00-000 Miasto");
        patient.setPhone("123-123-123");
        patient.setContact("Janina Nowak, 321-321-321");

        procedure1.setExamination("badanie fizykalne");
        procedure1.setDate("17-01-2023");
        procedure1.setExaminer("dr Iwicki");
        procedure1.setFee("250.00");

        procedure2.setExamination("zdjęcie rentgenowskie");
        procedure2.setDate("17-01-2023");
        procedure2.setExaminer("dr Jaracz");
        procedure2.setFee("500.00");

        procedure3.setExamination("badanie krwi");
        procedure3.setDate("17-01-2023");
        procedure3.setExaminer("dr Szymczak");
        procedure3.setFee("200.00");

        double value = procedure1.getFee() + procedure2.getFee() + procedure3.getFee();

        System.out.println("Dane pacjenta: " + patient.getName() + ", " + patient.getAddress() + ", " + patient.getPhone());
        System.out.println("Osoba kontaktowa: " + patient.getContact());
        System.out.println("Badanie1: " + procedure1.getExamination() + ", " + procedure1.getDate() + ", " + procedure1.getExaminer() +
                ", " + procedure1.getFee());
        System.out.println("Badanie2: " + procedure2.getExamination() + ", " + procedure2.getDate() + ", " + procedure2.getExaminer() +
                ", " + procedure2.getFee());
        System.out.println("Badanie3: " + procedure3.getExamination() + ", " + procedure3.getDate() + ", " + procedure3.getExaminer() +
                ", " + procedure3.getFee());
        System.out.println("Łączny koszt badań wynosi: " + value);
    }
}

package com.company.TasksSix;

import com.company.TasksSix.PersonalData;

public class TaskSixThree {
    public static void main(String[] args){
        String userName1 = "Sara", userName2 = "Marek", userName3 = "Julia";
        String userSurname1 = "Magura", userSurname2 = "Janczyk", userSurname3 = "Rak";
        String userAddress1 = "Sokrotki 2", userAddress2 = "Kowalczyka 3", userAddress3 = "Piernikowa 8";
        int userAge1 = 46, userAge2 = 20, userAge3 = 33;
        String userPhone1 = "112345678", userPhone2 = "987654321", userPhone3 = "123456789";

        PersonalData employee1 = new PersonalData(userName1, userSurname1, userAddress1, userAge1, userPhone1);
        PersonalData employee2 = new PersonalData(userName2, userSurname2, userAddress2, userAge2, userPhone2);
        PersonalData employee3 = new PersonalData(userName3, userSurname3, userAddress3, userAge3, userPhone3);
    }
}

package com.company;

public class human {
    String name;
    int year_birth;
    String surname;
    public static int current_year = 2023;
    void Output()
    {
        System.out.println("Name: "+ name+"\nSurname: "+surname+"\nAge: "+(current_year-year_birth));
    }
}


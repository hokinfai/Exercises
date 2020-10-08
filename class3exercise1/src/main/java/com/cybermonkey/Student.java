package com.cybermonkey;

import java.util.Scanner;

public class Student {
    public String name;
    public String idNumber;
    public String degree;
    public int year;

    public Student(String idNumber, String name, String degree){
        this.idNumber = idNumber;
        this.name = name;
        this.degree = degree;
        this.year = 1;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void advanceYear() {
        this.year = year++;
    }

    public String getName() {
        return name;
    }

    public String display() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", degree='" + degree + '\'' +
                ", year=" + year +
                '}';
    }
}

package com.example.sst.SOLIDPrinciples.SRP;

public class SaveReport {
    public void printReport(Student student, String grade) {
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + grade);
    }
}

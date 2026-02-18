package com.example.designpatterns.SOLIDPrinciples.SRP;

public class SaveReport {
    public void printReport(Student student, String grade) {
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + grade);
    }
}

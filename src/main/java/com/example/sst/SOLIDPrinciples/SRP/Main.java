package com.example.designpatterns.SOLIDPrinciples.SRP;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Ali", 90);

        CalculateGrade calculate = new CalculateGrade();
        String grade = calculate.gradecalculate(student);

        SaveReport save = new SaveReport();

    }
}
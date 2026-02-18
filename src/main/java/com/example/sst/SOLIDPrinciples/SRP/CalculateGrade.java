package com.example.designpatterns.SOLIDPrinciples.SRP;

public class CalculateGrade {
    public String gradecalculate(Student student){
        int marks =student.getMarks();
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else return "C";
    }
}

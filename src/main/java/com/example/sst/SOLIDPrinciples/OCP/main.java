package com.example.designpatterns.SOLIDPrinciples.OCP;

public class main {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(4,2);
        Shape circle =new Circle(3);
        AreaCalculator calculator=new AreaCalculator();
        System.out.println(calculator.calculateArea(rectangle));
        System.out.println(calculator.calculateArea(circle));
    }
}
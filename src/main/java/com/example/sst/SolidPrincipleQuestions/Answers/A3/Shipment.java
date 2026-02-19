package com.example.sst.SolidPrincipleQuestions.Answers.A3;

public abstract class Shipment {
    protected double weightKg;
    public Shipment(double weightKg){
        this.weightKg=weightKg;
    }
    abstract double cost();
}

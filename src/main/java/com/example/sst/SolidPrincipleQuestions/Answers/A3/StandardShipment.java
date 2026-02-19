package com.example.sst.SolidPrincipleQuestions.Answers.A3;

public class StandardShipment extends Shipment{
    public StandardShipment(double weightKg){
        super(weightKg);
    }
    @Override
    public double cost(){
        return  50*5*weightKg;
    }
}

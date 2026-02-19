package com.example.sst.SolidPrincipleQuestions.Answers.A3;

public class ExpressShipment extends Shipment{
    public ExpressShipment(double weightKg){
        super(weightKg);
    }

    @Override
    public double cost(){
        return 80 + 8 * weightKg;
    }
}

package com.example.sst.SolidPrincipleQuestions.Answers.A3;

public class OvernightShipment extends Shipment{
    public OvernightShipment(double weightKg) {
        super(weightKg);
    }

    @Override
    double cost() {
        return 120 + 10 * weightKg;
    }
}

package com.example.sst.SolidPrincipleQuestions.Answers.A3;

public class Main {
    public static void main(String[] args) {

        Shipment shipment = new ExpressShipment(2.0);

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        System.out.println(calculator.cost(shipment));
    }
}

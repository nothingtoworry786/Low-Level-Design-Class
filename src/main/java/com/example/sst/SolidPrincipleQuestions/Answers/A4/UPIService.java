package com.example.sst.SolidPrincipleQuestions.Answers.A4;

public class UPIService implements PaymentProvider {

    @Override
    public String pay(Payment payment) {
        return "Paid via UPI: " + payment.amount;
    }

}


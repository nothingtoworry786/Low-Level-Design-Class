package com.example.sst.SolidPrincipleQuestions.Answers.A4;

public class CARDService implements PaymentProvider {
    @Override
    public String pay(Payment payment) {
        return "Charged card: " + payment.amount;
    }
}

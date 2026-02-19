package com.example.sst.SolidPrincipleQuestions.Answers.A4;

public class WalletService implements PaymentProvider{
    @Override
    public String pay(Payment payment) {
        return "Wallet debit: " + payment.amount;
    }
}

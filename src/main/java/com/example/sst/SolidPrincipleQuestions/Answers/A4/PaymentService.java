package com.example.sst.SolidPrincipleQuestions.Answers.A4;

public class PaymentService {
    private PaymentProvider paymentProvider;
    PaymentService(PaymentProvider paymentProvider){
        this.paymentProvider=paymentProvider;
    }
        public String pay(Payment payment){
        return paymentProvider.pay(payment);
        }

}

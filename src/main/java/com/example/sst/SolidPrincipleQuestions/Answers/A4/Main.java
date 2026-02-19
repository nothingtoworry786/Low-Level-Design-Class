package com.example.sst.SolidPrincipleQuestions.Answers.A4;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment(499);

        PaymentProvider provider = new UPIService();

        PaymentService service = new PaymentService(provider);

        System.out.println(service.pay(payment));
    }
}

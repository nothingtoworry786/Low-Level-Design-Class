package com.example.sst.SolidPrincipleQuestions.Answers.A1;

public class Main {
    public static void main(String[] args) {
        NotificationService Email = new EmailService();
        OrderService orderService =new OrderService(Email);
            orderService.checkout("hello@gmail.com",10);
    }
}

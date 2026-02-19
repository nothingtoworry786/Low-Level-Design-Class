package com.example.sst.SolidPrincipleQuestions.Answers.A1;

public class OrderService {
    private NotificationService notificationService;
    OrderService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void  checkout(String CustomerEmail,double subtotel){
        double total =subtotel+subtotel*.18;
        notificationService.send(CustomerEmail,"Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }

}

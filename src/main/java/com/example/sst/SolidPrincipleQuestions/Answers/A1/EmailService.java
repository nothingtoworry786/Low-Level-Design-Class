package com.example.sst.SolidPrincipleQuestions.Answers.A1;

public class EmailService implements NotificationService{
    @Override
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}

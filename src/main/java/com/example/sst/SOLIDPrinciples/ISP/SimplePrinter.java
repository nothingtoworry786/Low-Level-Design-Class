package com.example.designpatterns.SOLIDPrinciples.ISP;

public class SimplePrinter implements Copier,Printer,Scanner {
    @Override
    public void print(Document doc){
        System.out.println("Printing the doc");
    }

    @Override
    public void scan(Document doc){
        System.out.println("Scan the doc");
    }

    @Override
    public void copy(Document doc){
        System.out.println("Copy the doc");
    }

}

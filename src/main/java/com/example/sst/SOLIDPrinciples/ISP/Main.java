package com.example.designpatterns.SOLIDPrinciples.ISP;

public class Main {
    public static void main(String[] args) {

        Document doc = new Document("My Important File");

        Scanner simplePrinter = new SimplePrinter();
        simplePrinter.scan(doc);

        System.out.println("------------------");

        SimplePrinter mfp = new SimplePrinter();
        mfp.print(doc);
        mfp.scan(doc);
        mfp.copy(doc);

        System.out.println("------------------");

        Printer printer = new SimplePrinter();
        printer.print(doc);
    }
}
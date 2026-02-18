package com.example.designpatterns.SOLIDPrinciples.ISP;

public class Document {

    private String name;

    Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
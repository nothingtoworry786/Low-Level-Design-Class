package com.example.sst.SOLIDPrinciples.OCP;

public class Rectangle implements Shape {

    private int height;
    private int width;   // better name than breath

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
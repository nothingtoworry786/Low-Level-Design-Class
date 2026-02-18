package com.example.designpatterns.SOLIDPrinciples.OCP;

import java.awt.*;

public class AreaCalculator {
    public double calculateArea(Shape shape){
        return  shape.calculateArea();
    }
}

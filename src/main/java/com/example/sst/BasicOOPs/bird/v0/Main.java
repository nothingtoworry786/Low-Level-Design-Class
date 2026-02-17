package com.example.sst.BasicOOPs.bird.v0;

import com.example.sst.BasicOOPs.bird.v0.fly.CanFly;
import com.example.sst.BasicOOPs.bird.v0.fly.CannotFly;
import com.example.sst.BasicOOPs.bird.v0.walk.Walk;

public class Main {
    public static void main(String[] args) {
        Bird sparrow= new Bird(new CanFly(),new Walk());
        sparrow.PerfromFly();
        sparrow.PerfromWalk();

        Bird Ostrich=new Bird(new CannotFly(),new Walk());
        Ostrich.PerfromFly();
        Ostrich.PerfromWalk();
    }
}

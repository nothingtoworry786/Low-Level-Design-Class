package com.example.sst.BaicOOPs.bird;

import com.example.sst.BaicOOPs.bird.fly.CanFly;
import com.example.sst.BaicOOPs.bird.fly.CannotFly;
import com.example.sst.BaicOOPs.bird.walk.Walk;

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

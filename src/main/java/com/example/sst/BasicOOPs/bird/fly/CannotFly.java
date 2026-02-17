package com.example.sst.BaicOOPs.bird.fly;

public class CannotFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}

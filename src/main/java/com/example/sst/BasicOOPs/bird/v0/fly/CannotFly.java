package com.example.sst.BasicOOPs.bird.v0.fly;

public class CannotFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}

package com.example.sst.BasicOOPs.bird.v0;

import com.example.sst.BasicOOPs.bird.v0.fly.FlyBehavior;
import com.example.sst.BasicOOPs.bird.v0.walk.WalkBehavior;

public class Bird {
    private FlyBehavior flyBehavior;
    private WalkBehavior walkBehavior;
    Bird(FlyBehavior flyBehavior,WalkBehavior walkBehavior){
        this.flyBehavior=flyBehavior;
        this.walkBehavior=walkBehavior;
    }
    public void PerfromWalk(){
        walkBehavior.walk();
    }
    public void PerfromFly(){
        flyBehavior.fly();
    }

}

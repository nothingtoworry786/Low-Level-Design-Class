package com.example.sst.BaicOOPs.bird;

import com.example.sst.BaicOOPs.bird.fly.FlyBehavior;
import com.example.sst.BaicOOPs.bird.walk.WalkBehavior;

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

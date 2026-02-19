package com.example.sst.SolidPrincipleQuestions.Answers.A2;

public class Cache {
    private Frame last;
    public void store(Frame frame){
        last=frame;
    }
    public boolean hasLast() {
        return last != null;
    }
}

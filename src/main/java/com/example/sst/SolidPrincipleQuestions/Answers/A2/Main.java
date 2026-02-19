package com.example.sst.SolidPrincipleQuestions.Answers.A2;

public class Main {
    public static void main(String[] args) {
        Decoder decode=new Decoder();
        Cache cache = new Cache();
        UI ui = new UI();

        Player player = new Player(decode,cache,ui);
        player.play(new byte[]{1,2,3,4});
    }
}

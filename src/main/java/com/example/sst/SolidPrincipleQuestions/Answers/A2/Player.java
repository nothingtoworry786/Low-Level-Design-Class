package com.example.sst.SolidPrincipleQuestions.Answers.A2;

public class Player {
    private Cache cache;
    private Decoder decoder;
    private UI ui;
    Player(Decoder decoder,Cache cache,UI ui){
        this.decoder=decoder;
        this.cache=cache;
        this.ui=ui;
    }
    public void play(byte[] fileByte){
        Frame frame =decoder.decode(fileByte);
        cache.store(frame);
        ui.showPlaying(fileByte.length);
        ui.showCacheStatus(cache.hasLast());
    }
}

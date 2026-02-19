package com.example.sst.SolidPrincipleQuestions.Questions.Q2;

import com.example.sst.SolidPrincipleQuestions.Answers.A2.Cache;
import com.example.sst.SolidPrincipleQuestions.Answers.A2.Decoder;
import com.example.sst.SolidPrincipleQuestions.Answers.A2.UI;

public class Player {
    private Frame last;

    void play(byte[] fileBytes){
        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        last = f;
        // draw UI
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // cache
        System.out.println("Cached last frame? " + (last!=null));
    }
}

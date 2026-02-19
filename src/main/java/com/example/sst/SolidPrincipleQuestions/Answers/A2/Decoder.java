package com.example.sst.SolidPrincipleQuestions.Answers.A2;

import javax.swing.event.InternalFrameEvent;

public class Decoder {
    public Frame decode(byte[] filebyte){
        return new Frame(filebyte);
    }
}

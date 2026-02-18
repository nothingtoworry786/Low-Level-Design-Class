package com.example.designpatterns.SOLIDPrinciples.LSP;

public class WritableFile extends ReadableFile implements Writable {

    @Override
    public void write() {
        System.out.println("Writing to a file ...");
    }
}

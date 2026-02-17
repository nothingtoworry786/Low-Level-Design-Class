package com.example.sst.BasicOOPs.tictactoe.Model;

import com.example.sst.BasicOOPs.tictactoe.strategy.MoveStrategy;

public class Player {
    private String name;
    private char symbol;
    private MoveStrategy moveStrategy;

    public Player(String name,char symbol,MoveStrategy moveStrategy){
        this.moveStrategy=moveStrategy;
        this.name=name;
        this.symbol=symbol;
    }

    public int[] makeMove(Board board) {
        return moveStrategy.makeMove(board);
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

}

package com.example.sst.BasicOOPs.tictactoe;

import com.example.sst.BasicOOPs.tictactoe.Model.Board;
import com.example.sst.BasicOOPs.tictactoe.Model.Player;
import com.example.sst.BasicOOPs.tictactoe.service.Game;
import com.example.sst.BasicOOPs.tictactoe.strategy.HumanMoveStrategy;

public class Main {
    public static void main(String[] args) {

        Board board = new Board(3);

        Player player1 = new Player("Player 1", 'X', new HumanMoveStrategy());
        Player player2 = new Player("Player 2", 'O', new HumanMoveStrategy());

        Game game = new Game(board, player1, player2);
        game.start();
    }
}

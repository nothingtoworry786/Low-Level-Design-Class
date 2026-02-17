package com.example.sst.BasicOOPs.tictactoe.service;

import com.example.sst.BasicOOPs.tictactoe.Model.Board;
import com.example.sst.BasicOOPs.tictactoe.Model.Player;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Board board,Player player1,Player player2){
        this.board=board;
        this.player1=player1;
        this.player2=player2;
    }
    public void start() {

        Player currentPlayer = player1;

        while (true) {

            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn");

            int[] move = currentPlayer.makeMove(board);

            if (!board.placeMove(move[0], move[1], currentPlayer.getSymbol())) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            if (board.checkWinner(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("Game Draw!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}


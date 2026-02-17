package com.example.sst.BasicOOPs.tictactoe.strategy;

import com.example.sst.BasicOOPs.tictactoe.Model.Board;

import java.util.Scanner;

public class HumanMoveStrategy implements MoveStrategy{
    private Scanner scanner=new Scanner(System.in);
    @Override
    public int[] makeMove(Board board){
        System.out.print("Enter row and column: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }
}

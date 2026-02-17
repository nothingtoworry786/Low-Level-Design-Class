package com.example.sst.BasicOOPs.tictactoe.Model;

public class Board {
    private int size;
    private char[][]grid;
    public Board(int size){
        this.size=size;
        this.grid=new char[size][size];
        initialize();
    }
    private void initialize(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               grid[i][j]=' ';
            }
        }
    }
    public boolean placeMove(int row,int col,char symbol) {
        if (row < 0 || col < 0 || col >= size || row >= size) {
            return false;
        }
        if (grid[row][col] == ' ') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }
    public boolean checkWinner(char symbol) {
        for (int i = 0; i < size; i++) {
            if (checkRow(i, symbol) || checkColumn(i, symbol))
                return true;
        }
        return checkDiagonals(symbol);
    }
    public boolean checkRow(int row,char symbol){
        for (int i=0;i<size;i++) {
            if (grid[row][i] != symbol) {
                return false;
            }
        }
        return true;
    }
    public boolean checkColumn(int col,char symbol){
        for (int i=0;i<size;i++) {
            if (grid[i][col] != symbol) {
                return false;
            }
        }
        return true;
    }
    public boolean checkDiagonals(char symbol){
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        for(int i=0;i<size;i++){
            if(grid[i][i]!=symbol){
                return false;
            }
            if(grid[i][size-i-1]!=symbol){
                return false;
            }
        }
        return leftDiagonal ||rightDiagonal;

    }
    public boolean isFull(){
        for (int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(grid[i][j]==' ')return  false;
            }
        }
        return true;
    }
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            System.out.println("-------------");
            for (int j = 0; j < size; j++)
                System.out.print("| " + grid[i][j] + " ");
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}

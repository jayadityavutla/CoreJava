package com.scaler.advancejava.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Player {
    private String name;
    private int id;
    private Symbol symbol;
    private PlayerType playerType;
    private static Scanner scanner = new Scanner(System.in);

    public Player(String name, int id, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.id = id;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        System.out.println("Please tell us the row number to place your symbol between 0 to n-1");
        int row = scanner.nextInt();
        System.out.println("Please tell us the column number to place your symbol between 0 to n-1");
        int column = scanner.nextInt();
        //Check the move is valid
        if(board.getBoard().get(row).get(column).getCellState() == CellState.FILLED){
            System.out.println("This position is already filled, Please try again");
            return null;
        }
        return new Move(this, new Cell(row, column));
    }
}

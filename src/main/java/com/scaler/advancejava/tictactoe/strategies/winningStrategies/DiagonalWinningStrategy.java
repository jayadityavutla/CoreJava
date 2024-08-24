package com.scaler.advancejava.tictactoe.strategies.winningStrategies;

import com.scaler.advancejava.tictactoe.models.Board;
import com.scaler.advancejava.tictactoe.models.Move;
import com.scaler.advancejava.tictactoe.models.Symbol;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{
    private HashMap<Symbol, Integer> leftDiagonal = new HashMap<>();
    private HashMap<Symbol, Integer> rightDiagonal = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        //Check for left Diagonal
        if(row == col){
            if(!leftDiagonal.containsKey(symbol)) {
                leftDiagonal.put(symbol, 0);
            }
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) + 1);
            //Check Winner
            if(leftDiagonal.get(symbol) == board.getDimension()){
                return true;
            }
        }

        //Check for Right Diagonal
        if(row + col == board.getDimension() - 1){
            if(!rightDiagonal.containsKey(symbol)) {
                rightDiagonal.put(symbol, 0);
            }
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) + 1);
            //Check Winner
            if(rightDiagonal.get(symbol) == board.getDimension()){
                return true;
            }
        }
        return false;
    }

    //Remove counts when Undo
    @Override
    public void handleundo(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(row == col){
            leftDiagonal.put(symbol, leftDiagonal.get(symbol) - 1);
        }
        if(row + col == board.getDimension() - 1){
            rightDiagonal.put(symbol, rightDiagonal.get(symbol) - 1);
        }
    }
}

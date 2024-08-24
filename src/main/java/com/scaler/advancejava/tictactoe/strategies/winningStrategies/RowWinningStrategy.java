package com.scaler.advancejava.tictactoe.strategies.winningStrategies;

import com.scaler.advancejava.tictactoe.models.Board;
import com.scaler.advancejava.tictactoe.models.Move;
import com.scaler.advancejava.tictactoe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    private HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!counts.containsKey(row)) {
            counts.put(row, new HashMap<>());
        }

        HashMap<Symbol, Integer> rowMap = counts.get(row);
        if(!rowMap.containsKey(symbol)) {
            rowMap.put(symbol, 0);
        }
        rowMap.put(symbol, rowMap.get(symbol) + 1);

        if(rowMap.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }

    //Remove counts when Undo
    @Override
    public void handleundo(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        counts.get(row).put(symbol, counts.get(row).get(symbol) - 1);
    }
}

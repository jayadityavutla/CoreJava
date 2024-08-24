package com.scaler.advancejava.tictactoe.strategies.winningStrategies;

import com.scaler.advancejava.tictactoe.models.Board;
import com.scaler.advancejava.tictactoe.models.Move;
import com.scaler.advancejava.tictactoe.models.Symbol;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy {

    private HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!counts.containsKey(col)) {
            counts.put(col, new HashMap<>());
        }

        HashMap<Symbol, Integer> colMap = counts.get(col);
        if(!colMap.containsKey(symbol)) {
            colMap.put(symbol, 0);
        }
        colMap.put(symbol, colMap.get(symbol) + 1);

        if(colMap.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }

    //Remove counts when Undo
    @Override
    public void handleundo(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        counts.get(col).put(symbol, counts.get(col).get(symbol) - 1);
    }
}

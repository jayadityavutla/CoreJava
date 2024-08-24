package com.scaler.advancejava.tictactoe.strategies.winningStrategies;

import com.scaler.advancejava.tictactoe.models.Board;
import com.scaler.advancejava.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
    void handleundo(Board board, Move move);
}

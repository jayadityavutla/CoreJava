package com.scaler.advancejava.tictactoe.strategies.botPlayingStrategies;

import com.scaler.advancejava.tictactoe.models.Board;
import com.scaler.advancejava.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}

package com.scaler.advancejava.tictactoe.controller;

import com.scaler.advancejava.tictactoe.exception.DuplicateSymbolsException;
import com.scaler.advancejava.tictactoe.exception.InvalidBotCountException;
import com.scaler.advancejava.tictactoe.exception.InvalidPlayerCountException;
import com.scaler.advancejava.tictactoe.models.Game;
import com.scaler.advancejava.tictactoe.models.Player;
import com.scaler.advancejava.tictactoe.strategies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException, DuplicateSymbolsException {
        Game game = Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
        return game;
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void undo(Game game){
        game.undo();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

}

package com.scaler.advancejava.tictactoe;

import com.scaler.advancejava.tictactoe.controller.GameController;
import com.scaler.advancejava.tictactoe.exception.DuplicateSymbolsException;
import com.scaler.advancejava.tictactoe.exception.InvalidBotCountException;
import com.scaler.advancejava.tictactoe.exception.InvalidPlayerCountException;
import com.scaler.advancejava.tictactoe.models.*;
import com.scaler.advancejava.tictactoe.strategies.winningStrategies.ColumnWinningStrategy;
import com.scaler.advancejava.tictactoe.strategies.winningStrategies.DiagonalWinningStrategy;
import com.scaler.advancejava.tictactoe.strategies.winningStrategies.RowWinningStrategy;
import com.scaler.advancejava.tictactoe.strategies.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException, DuplicateSymbolsException {
        Scanner scanner = new Scanner(System.in);
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player("Jay",0,new Symbol('X'), PlayerType.HUMAN));
        players.add(new Bot("Gemini",1,new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, winningStrategies);

        System.out.println("************Start the Tic Tac Toe Game************");

        while(game.getGameState().equals(GameState.INPROGRESS)){
            gameController.printBoard(game);
            System.out.println("Do you want to undo? If Yes enter 'Y' else enter 'N': ");
            String undoInput = scanner.next();

            if(undoInput.equalsIgnoreCase("Y")){
                gameController.undo(game);
                continue;
            }
            gameController.makeMove(game);
        }

        gameController.printBoard(game);

        //If game is draw
        if(game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game is draw");
        }

        //If game is Ended with winner
        if(game.getGameState().equals(GameState.ENDED)){
            System.out.println(gameController.getWinner(game).getName() + " won the game");
        }
    }
}

package com.scaler.advancejava.tictactoe.strategies.botPlayingStrategies;

import com.scaler.advancejava.tictactoe.models.Board;
import com.scaler.advancejava.tictactoe.models.Cell;
import com.scaler.advancejava.tictactoe.models.CellState;
import com.scaler.advancejava.tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row : board.getBoard()){
            for(Cell cell : row){
                if(cell.getCellState() == CellState.EMPTY){
                    return new Move(null, cell);
                }
            }
        }
        return null;
    }
}

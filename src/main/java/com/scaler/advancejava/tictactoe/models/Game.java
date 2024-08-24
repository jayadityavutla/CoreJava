package com.scaler.advancejava.tictactoe.models;

import com.scaler.advancejava.tictactoe.exception.DuplicateSymbolsException;
import com.scaler.advancejava.tictactoe.exception.InvalidBotCountException;
import com.scaler.advancejava.tictactoe.exception.InvalidPlayerCountException;
import com.scaler.advancejava.tictactoe.strategies.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.INPROGRESS;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("Player " + currentPlayer.getName() + " 's move");
        //Check the move is valid
        Move move = currentPlayer.makeMove(board);
        if(move == null){
            return;
        }
        System.out.println(currentPlayer.getName() + " is moving " + move.getCell().getRow() + " " + move.getCell().getCol());
        //
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getBoard().get(row).get(col);
        cellToChange.setPlayer(currentPlayer);
        cellToChange.setCellState(CellState.FILLED);

        Move finalMoveObject = new Move(currentPlayer, cellToChange);
        moves.add(finalMoveObject);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

        //After made a move check for any winner

        if(checkWinner(finalMoveObject)){
            winner = currentPlayer;
            gameState = GameState.ENDED;
        } else if(moves.size() == board.getDimension() * board.getDimension()){
            gameState = GameState.DRAW;
        }
    }

    public void printBoard(){
        board.printBoard();
    }

    private boolean checkWinner(Move move) {
        //Check all winning strategies and if there is a win
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public void undo(){
        if(moves.isEmpty()){
            System.out.println("There are no moves to Undo");
            return;
        }

        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(lastMove);

        Cell lastCell = lastMove.getCell();
        lastCell.setPlayer(null);
        lastCell.setCellState(CellState.EMPTY);

        //Remove in HashMaps as well, used for counts of symbol in winning strategy
        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleundo(board, lastMove);
        }

        nextPlayerIndex -= 1;
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }


    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private void playerCountValidation() throws InvalidPlayerCountException {
            //Validation to be enhanced for playerCount (players.size() >= dimension)
            if(players == null || players.size() != dimension - 1){
                throw new InvalidPlayerCountException("Player count Exceeded");
            }
        }

        private void botCountValidation() throws InvalidBotCountException {
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new InvalidBotCountException("Bot count exceeded");
            }
        }

        private void differentSymbolForAllPlayers() throws DuplicateSymbolsException{
            HashSet<Character> symbols = new HashSet<>();
            for(Player player : players){
                char sym = player.getSymbol().getaChar();
                if(!symbols.contains(sym)){
                    symbols.add(sym);
                }
                else throw new DuplicateSymbolsException("Duplicate symbol found");
            }
        }

        private void validation() throws InvalidPlayerCountException, InvalidBotCountException, DuplicateSymbolsException {
            playerCountValidation();
            botCountValidation();
            differentSymbolForAllPlayers();
        }

        public Game build() throws InvalidBotCountException, InvalidPlayerCountException, DuplicateSymbolsException {
            //Validations
            validation();
            return new Game(dimension, players, winningStrategies);
        }
    }
}

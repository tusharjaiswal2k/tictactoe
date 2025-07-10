package models;

import java.util.ArrayList;
import java.util.List;

import exception.InvalidBoardSizeException;
import exception.InvalidNumberOfPlayersException;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextMovePlayerIndex;
    private List<Move> moves;
    private List<Board> PlayerBoarda;

    private Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        this.gameState = GameState.YET_TO_START;
        this.nextMovePlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.PlayerBoarda = new ArrayList<>();
        // TODO Auto-generated constructor stub
    }

    // get and setters for gamestate
    public GameState getGameState() {
        return gameState;
    }

    public Board getBoard() {
        return board;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game [board=" + board + ", players=" + players + ", gameState=" + gameState + ", winner=" + winner
                + ", nextMovePlayerIndex=" + nextMovePlayerIndex + ", moves=" + moves + ", PlayerBoarda=" + PlayerBoarda
                + "]";
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int size;
        private List<Player> players;

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder players(List<Player> players) {
            this.players = players;
            return this;
        }

        private void validate() {
            if (size > 10 || size < 3) {
                throw new InvalidBoardSizeException("Size must be greater than or equal to 3");
            }

            if (players.size() != (size - 1)) {
                throw new InvalidNumberOfPlayersException("Number of players must be equal to size of board minus one");
            }

        }

        public Game build() {
            validate();
            return new Game(new Board(size), players);
        }
    }
}

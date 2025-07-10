package services;

import java.util.Collections;
import java.util.List;

import models.Game;
import models.GameState;
import models.Player;

public class GameService {
    public GameService() {

    }

    public Game creatGame(int size, List<Player> players) {
        Game newGame = Game.builder().size(size).players(players).build();
        return newGame;
    }

    public Game startGame(Game game) {
        game.setGameState(GameState.IN_PROGRESS);
        List<Player> players = game.getPlayers();
        Collections.shuffle(players);
        game.setPlayers(players);
        return game;
        // TODO Auto-generated method stub

    }
}

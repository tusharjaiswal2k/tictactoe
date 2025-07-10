package services;

import java.util.HashSet;

import exception.DuplicateSymbolException;
import models.Player;
import models.PlayerType;

public class PlayerService {
    private static int counter = 1;
    private HashSet<Character> symbolSet;

    // TODO Auto-generated constructor stub
    public PlayerService() {
        // TODO Auto-generated constructor stub
        this.symbolSet = new HashSet<>();
    }

    public Player createPlayer(String name, char symbol) {

        if (symbolSet.contains(symbol)) {
            throw new DuplicateSymbolException("Symbol already exists");
        }

        symbolSet.add(symbol);
        // TODO Auto-generated method stub
        return new Player(counter++, name, symbol, PlayerType.HUMAN);
    }
}

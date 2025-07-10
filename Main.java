import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Game;
import models.Player;
import services.BoardService;
import services.GameService;
import services.PlayerService;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
        PlayerService playerService = new PlayerService();
        GameService gameService = new GameService();

        BoardService boardService = new BoardService();

        System.out.println("WELCOME TO TICTACTOE");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of the board");
        int size = sc.nextInt();
        sc.nextLine();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < size - 1; i++) {
            System.out.println("Enter the name of the player");
            String name = sc.nextLine();

            System.out.println("Enter the symbol of the player");
            char symbol = sc.nextLine().charAt(0);

            players.add(playerService.createPlayer(name, symbol));
        }

        Game game = gameService.creatGame(size, players);
        game = gameService.startGame(game);
        boardService.printBoard(game.getBoard());
    }
}
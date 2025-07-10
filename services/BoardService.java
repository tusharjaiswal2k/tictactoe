package services;

import java.util.List;

import models.Board;
import models.Cell;

public class BoardService {
    public static void printBoard(Board board) {
        // TODO Auto-generated method stub
        List<List<Cell>> cells = board.getCells();
        for (int i = 0; i < board.getSize(); i++) {
            List<Cell> row = cells.get(i);
            for (Cell cell : row) {
                if (cell.getPlayer() == null) {
                    System.out.print("|   | ");
                } else {
                    System.out.print("|" + cell.getPlayer().getSymbol() + "| ");
                }
            }
            System.out.println();
        }
    }
}

package models;

public class Cell {
    private int row;
    private int cell;
    private CellState cellState;
    private Player player;

    public Cell(int row, int cell) {
        this.row = row;
        this.cell = cell;
        this.cellState = CellState.EMPTY;
    }

    // put all the getter and setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}

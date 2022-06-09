package ua.ithillel.classwork.tictactoe;

public class CoordinateChecker extends Field {

    public boolean isEmpty(Coordinate coordinate) {
        char[][] data = this.getData();
        return (data[coordinate.getH()][coordinate.getV()] == getEmptySymbol());
    }
}

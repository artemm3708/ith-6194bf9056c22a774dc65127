package ua.ithillel.classwork.tictactoe;

public class DrawChecker extends Field {

    public boolean draw() {
        char[][] data = this.getData();
        boolean draw = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] == this.getEmptySymbol()) {
                    draw = false;
                    break;
                }
            }
        }
        return draw;
    }
}

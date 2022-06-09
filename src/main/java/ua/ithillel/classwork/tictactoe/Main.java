package ua.ithillel.classwork.tictactoe;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
        WinChecker winChecker = new WinChecker();
        DrawChecker drawChecker = new DrawChecker();
        FieldDrawer fieldDrawer = new FieldDrawer();

        fieldDrawer.draw(field);

        while (!winChecker.win() || !drawChecker.draw()) {

            Coordinate coordinate = new StdoutCoordinateScanner().scan();
            field.setValue(coordinate.getH() - 1, coordinate.getV() - 1, 'X');
            fieldDrawer.draw(field);

            CoordinateValidator validator = new CoordinateValidator(0, 2);
            RandomCoordinateScanner randomCoordinateScanner = new RandomCoordinateScanner();

            Coordinate randomCoordinate;
            do {
                randomCoordinate = randomCoordinateScanner.scan();
                System.out.println(randomCoordinate);
            } while (validator.notValid(randomCoordinate));

            field.setValue(randomCoordinate.getH(), randomCoordinate.getV(), '0');
            fieldDrawer.draw(field);
        }

    }
}

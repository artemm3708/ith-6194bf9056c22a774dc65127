package ua.ithillel.classwork.tictactoe;

import java.util.Random;

public class RandomCoordinateScanner implements CoordinateScanner {

    private final Random random = new Random();

    @Override
    public Coordinate scan() {
        Coordinate coordinate = new Coordinate(random.nextInt(3), random.nextInt(3));
        CoordinateChecker checker = new CoordinateChecker();
        if (checker.isEmpty(coordinate)) {
            return coordinate;
        } else {
            return scan();
        }
    }
}

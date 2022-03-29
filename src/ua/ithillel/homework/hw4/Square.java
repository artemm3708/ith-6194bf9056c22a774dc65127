package ua.ithillel.homework.hw4;

public class Square implements FigureArea{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        double area = this.side * this.side;
        return area;
    }
}

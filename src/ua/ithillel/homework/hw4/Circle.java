package ua.ithillel.homework.hw4;

public class Circle implements FigureArea {

    private final double PI = 3.14;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        double area = (PI * this.r) * 2;
        return area;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

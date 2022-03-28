package ua.ithillel.homework.hw4;

public class Circle implements FigureArea {

    private static final double PI = Math.PI;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return (PI * this.r) * 2;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

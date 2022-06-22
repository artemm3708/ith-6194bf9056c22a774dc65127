package ua.ithillel.homework.hw4;

public class Triangle implements FigureArea {

    int side1;
    int side2;
    int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double halfArea = (this.side1 + this.side2 + this.side3) / 2;
        double p = halfArea * (halfArea - this.side1) * (halfArea - this.side2) * (halfArea - this.side3);
        double area = Math.sqrt(p);
        return area;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}

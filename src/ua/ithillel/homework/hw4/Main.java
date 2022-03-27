package ua.ithillel.homework.hw4;

public class Main {

    public static void main(String[] args) {

        FigureArea[] figures = getArray();

        sumAreas(figures);

    }

    private static void sumAreas(FigureArea[] figures) {
        int allAreas = 0;
        for (FigureArea areas : figures) {
            allAreas += areas.area();
        }
        System.out.printf("Суммарная площадь всех фигур %s см", allAreas);
    }

    public static FigureArea[] getArray() {
        return new FigureArea[]{new Circle(3), new Triangle(2, 4, 1), new Square(4)};
    }

}

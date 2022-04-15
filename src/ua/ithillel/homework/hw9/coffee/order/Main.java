package ua.ithillel.homework.hw9.coffee.order;

public class Main {

    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Artem");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-van");
        coffeeOrderBoard.add("John Snow");
        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(1);
        coffeeOrderBoard.deliver(4);

        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();

        coffeeOrderBoard.draw();
    }
}

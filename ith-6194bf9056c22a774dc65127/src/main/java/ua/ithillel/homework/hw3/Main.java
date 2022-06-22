package ua.ithillel.homework.hw3;

public class Main {

    public static void main(String[] args) {

        Dog marsDog = new Dog("Mars");
        marsDog.run(501);
        marsDog.swim(40);

        Cat rocksCat = new Cat("Rocks");
        rocksCat.run(20);
        rocksCat.swim(100);

        System.out.println(Cat.returnCount());
        System.out.println(Dog.returnCount());
        System.out.println(Animal.returnCount());

    }
}

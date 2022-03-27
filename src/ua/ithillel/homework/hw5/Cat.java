package ua.ithillel.homework.hw5;

public class Cat extends Member {

    public Cat() {
        super("Cat", 10, 30);
    }

    @Override
    public void run() {
        System.out.println("cat runs");
    }

    @Override
    public void jump() {
        System.out.println("cat jumps");
    }
}

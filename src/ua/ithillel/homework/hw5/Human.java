package ua.ithillel.homework.hw5;

public class Human extends Member {

    public Human() {
        super("Human", 100, 15);
    }

    @Override
    public void run() {
        System.out.println("human runs");
    }

    @Override
    public void jump() {
        System.out.println("human jumps");
    }
}

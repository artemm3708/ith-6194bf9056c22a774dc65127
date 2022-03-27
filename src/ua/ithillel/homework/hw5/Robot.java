package ua.ithillel.homework.hw5;

public class Robot extends Member {

    public Robot() {
        super("Robot", 50, 20);
    }

    @Override
    public void run() {
        System.out.println("robot runs");
    }

    @Override
    public void jump() {
        System.out.println("robot jumps");
    }
}

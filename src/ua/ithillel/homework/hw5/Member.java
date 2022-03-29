package ua.ithillel.homework.hw5;

public abstract class Member {

    private int length;
    private int height;
    private String name;

    public Member(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    public abstract void run();

    public abstract void jump();

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}

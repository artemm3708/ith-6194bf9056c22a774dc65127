package ua.ithillel.homework.hw3;

public class Animal {

    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int length) {
        System.out.println(this.getName() + " пробежал(а) " + length + " метров");
    }

    public void swim(int length) {
        System.out.println(this.getName() + " проплыл(а)" + length + " метров");
    }

    public static int returnCount() {
        return count;
    }


}

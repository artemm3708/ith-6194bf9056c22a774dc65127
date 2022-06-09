package ua.ithillel.homework.hw3;

public class Cat extends Animal {

    private final int MAX_RUN = 200;
    private static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int length) {
        if (length > this.MAX_RUN) {
            System.out.println(this.getName() + " не может пробежать больше " + this.MAX_RUN + " метров");
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(this.getName() + " не умеет плавать");
    }

    public static int returnCount() {
        return count;
    }
}

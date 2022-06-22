package ua.ithillel.homework.hw3;

public class Dog extends Animal {

    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    private static int count = 0;

    public Dog(String name) {
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
        if (length > this.MAX_SWIM) {
            System.out.println(this.getName() + " не может проплыть больше " + this.MAX_SWIM + " метров");
        } else {
            super.swim(length);
        }
    }

    public static int returnCount() {
        return count;
    }
}

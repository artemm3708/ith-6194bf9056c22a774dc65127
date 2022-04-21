package ua.ithillel.homework.hw11.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private final T val;
    private List<T> amount;

    public Box(T val) {
        this.val = val;
        this.amount = new ArrayList<T>();
    }

    public void add() {
        this.amount.add(this.val);
    }

    public void add(List<T> fruits) {
        this.amount.addAll(fruits);
    }

    public float getWeight() {
        float weight = 0;
        for (T fruits : amount) {
            weight += fruits.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        if (this.val.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void merge(Box<T> box) {
        this.amount.addAll(box.amount);
        box.amount.clear();
    }
}

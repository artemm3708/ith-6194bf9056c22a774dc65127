package ua.ithillel.homework.hw11.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> amount;

    public Box(T val) {
        this.amount = new ArrayList<T>();
    }

    public void add(T fruit) {
        this.amount.add(fruit);
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
        return this.getWeight() == box.getWeight();
    }

    public void merge(Box<T> box) {
        this.amount.addAll(box.amount);
        box.amount.clear();
    }
}

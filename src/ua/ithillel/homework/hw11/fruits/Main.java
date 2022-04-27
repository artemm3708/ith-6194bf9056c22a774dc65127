package ua.ithillel.homework.hw11.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit orange = new Orange();

        Box<Apple> appleBox = new Box(apple);
        Box<Orange> orangeBox = new Box(orange);
        Box<Apple> appleBox1 = new Box(apple);

        List<Apple> apples = new ArrayList(Arrays.asList(apple, apple2, apple3));

        appleBox.add(new Apple());
        //orangeBox.add(Arrays.asList(new Orange(), new Orange()));
        appleBox.add(apples);
        //appleBox1.add(Arrays.asList(new Apple(), new Apple()));

        System.out.println(appleBox.getWeight());
        //System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
        //appleBox.merge(appleBox1);
        //System.out.println(appleBox.getWeight());
    }
}

package ua.ithillel.homework.hw16;

public class TestClass {

    @BeforeSuit
    public void beforeSuit() {
        System.out.println("Before");
    }

    @Test(order = 1)
    public void print1() {
        System.out.println(1);
    }

    @Test(order = 3)
    public void print2() {
        System.out.println(3);
    }

    @Test(order = 2)
    public void print3() {
        System.out.println(2);
    }

    @AfterSuit
    public void afterSuit() {
        System.out.println("After");
    }
}

package ua.ithillel.homework.hw16;

public class Test1 {

    @BeforeSuit
    public void print() {
        System.out.println("1");
    }

    @Test
    public void print2() {
        int order = 1;
        System.out.println(2);
    }

    @Test
    public void print3() {
        int order = 2;
        System.out.println(3);
    }

    @AfterSuit
    public void print4() {
        System.out.println("4");
    }
}

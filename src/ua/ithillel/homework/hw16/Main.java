package ua.ithillel.homework.hw16;

public class Main {

    public static void main(String[] args) throws Exception {
        Test1 test1 = new Test1();
        Class<Test1> test1Class = Test1.class;
        TestRunner.start(test1Class, test1);
    }
}

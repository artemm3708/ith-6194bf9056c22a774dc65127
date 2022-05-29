package ua.ithillel.homework.hw16;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class TestRunner {

    public static void start(Class<?> obj, Object o) throws Exception {
        List<Method> methods = Arrays.asList(obj.getDeclaredMethods());
        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuit.class)) {
                m.invoke(o);
            }
        }
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                m.invoke(o);
            }
        }

        for (Method m : methods) {
            if (m.isAnnotationPresent(AfterSuit.class)) {
                m.invoke(o);
            }
        }
    }
}

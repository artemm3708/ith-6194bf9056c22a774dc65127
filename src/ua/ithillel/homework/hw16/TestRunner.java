package ua.ithillel.homework.hw16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestRunner {

    public static void start(Class<?> testClass) {
        try {
            List<Method> methods = Arrays.asList(testClass.getDeclaredMethods());
            Object testObject = testClass.getConstructor().newInstance();
            List<Method> setUpMethods = Arrays.stream(testClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(BeforeSuit.class))
                    .toList();
            if (setUpMethods.size() > 1) throw new RuntimeException("BeforeSuite annotation must be a single.");

            List<Method> testMethods = Arrays.stream(testClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(Test.class))
                    .sorted(Comparator.comparingInt(o -> o.getAnnotation(Test.class).order()))
                    .toList();

            List<Method> tearDownMethods = Arrays.stream(testClass.getDeclaredMethods())
                    .filter(method -> method.isAnnotationPresent(AfterSuit.class))
                    .toList();
            if (tearDownMethods.size() > 1) throw new RuntimeException("AfterSuite annotation must in a single.");

            if (setUpMethods.size() == 1) setUpMethods.get(0).invoke(testObject);
            for (Method method : testMethods) {
                method.invoke(testObject);
            }
            if (tearDownMethods.size() == 1) tearDownMethods.get(0).invoke(testObject);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Something went wrong during test execution.", e);
        }
    }
}

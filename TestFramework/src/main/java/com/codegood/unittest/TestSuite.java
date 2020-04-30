package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class TestSuite {
    private List<TestCase> tests = new LinkedList<>();

    public void add(TestCase test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach(testCase -> testCase.run(result));
    }
    public void add(Class<? extends TestCase> classToTest) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        for(Method method : classToTest.getMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                tests.add(classToTest.getConstructor(String.class).newInstance(method.getName()));
            }
        }
    }
}

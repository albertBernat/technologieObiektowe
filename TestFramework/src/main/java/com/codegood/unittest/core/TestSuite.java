package com.codegood.unittest.core;

import com.codegood.unittest.runner.TestPrinter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class TestSuite {
    private final List<TestCase> tests = new LinkedList<>();
    private final TestPrinter testPrinter = new TestPrinter();

    public void add(TestCase test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach(testCase -> {
            testCase.run(result);
            testPrinter.printCurrentTestStatus(result.getLastTestedMethodFullName(), result.isLastTestPassed());
        });
    }

    public void add(Class<? extends TestCase> classToTest)  {
        for(Method method : classToTest.getMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    tests.add(classToTest.getConstructor(String.class).newInstance(method.getName()));
                } catch (InstantiationException e) {
                    System.err.println("Cannot instantiate object " + e.getMessage());
                } catch (IllegalAccessException e) {
                    System.err.println("Illegal access exception " + e.getMessage());
                } catch (InvocationTargetException e) {
                    System.err.println("Cannot invoke desired method " + e.getMessage());
                } catch (NoSuchMethodException e) {
                    System.err.println("No such method" + e.getMessage());
                }
            }
        }
    }
}

package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

    private final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public TestResult run() {
        TestResult result = new TestResult();
        result.testStarted();
        this.setUp();
        try {
            Method method = this.getClass().getMethod(this.name);
            method.invoke(this);
        } catch (Exception e) {
            result.testFailed();
        }
        this.tearDown();
        return result;
    }

    public void tearDown() {
    }

    public void setUp() {
    }
}

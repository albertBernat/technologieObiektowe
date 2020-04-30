package com.codegood.unittest;

import java.lang.reflect.Method;

public class TestCase {

    private final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult result) {
        result.testStarted();
        this.setUp();
        try {
            Method method = this.getClass().getMethod(this.name);
            method.invoke(this);
        } catch (Exception e) {
            e.printStackTrace();
            result.testFailed();
        } finally {
            this.tearDown();
        }
    }

    public void tearDown() {
    }

    public void setUp() {
    }
}

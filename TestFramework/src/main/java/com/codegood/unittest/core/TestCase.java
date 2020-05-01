package com.codegood.unittest.core;

import java.lang.reflect.Method;

public class TestCase {

    private String name;

    public TestCase(String name) {
        this.name = name;
    }

    public TestCase() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(TestResult result) {
        result.testStarted();
        this.setUp();
        try {
            Method method = this.getClass().getMethod(this.name);
            result.setLastTestedMethodFullName(method.getDeclaringClass().getCanonicalName() + "." + method.getName());
            method.invoke(this);
            result.setHasPassed(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.testFailed();
            result.setHasPassed(false);
        } finally {
            this.tearDown();
        }
    }

    public void tearDown() {
    }

    public void setUp() {
    }
}

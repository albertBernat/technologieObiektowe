package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;

public class TestCaseTest extends TestCase {

    private WasRun test;

    public TestCaseTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.test = new WasRun("testMethod");
    }

    public void testRunning() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test.run();
        assert test.wasRun;
    }

    public void testSetUp() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test.run();
        assert test.wasSetUp;
    }
}

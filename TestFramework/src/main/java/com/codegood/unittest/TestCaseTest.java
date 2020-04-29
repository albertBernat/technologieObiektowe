package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;

public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("testMethod");
        assert !test.wasRun;
        test.run();
        assert test.wasRun;
    }
}

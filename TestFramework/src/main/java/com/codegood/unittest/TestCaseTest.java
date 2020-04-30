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

    public void testTemplateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test.run();
        assert "setUp testMethod tearDown".equals(test.log);
    }

}

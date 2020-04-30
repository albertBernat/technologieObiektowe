package com.codegood.unittest;

public class WasRun extends TestCase {

    public boolean wasRun;
    public String log;

    public WasRun(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        wasRun = false;
        log = "setUp";
    }

    @Override
    public void tearDown() {
        log = log + " tearDown";
    }

    @SuppressWarnings("unused")
    public void testMethod() {
        wasRun = true;
        log = log + " testMethod";
    }

    public void testBrokenMethod() throws Exception {
        log = log + " testBrokenMethod";
        throw new Exception();
    }

}

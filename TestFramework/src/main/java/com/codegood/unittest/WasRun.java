package com.codegood.unittest;

public class WasRun extends TestCase {

    public boolean wasRun;

    public WasRun(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.wasRun = false;
        this.wasSetUp = true;
    }

    @SuppressWarnings("unused")
    public void testMethod() {
        wasRun = true;
    }


}

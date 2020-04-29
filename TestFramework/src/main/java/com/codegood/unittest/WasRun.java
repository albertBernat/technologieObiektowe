package com.codegood.unittest;

public class WasRun extends TestCase {

    public boolean wasRun;

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
    }

    @SuppressWarnings("unused")
    public void testMethod() {
        wasRun = true;
    }
}

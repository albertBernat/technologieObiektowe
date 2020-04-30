package com.codegood.unittest;

public class WasRun extends TestCase {

    public boolean wasRun;
    public String log;

    public WasRun(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.wasRun = false;
        this.log = "setUp";
    }

    @Override
    public void tearDown() {
        this.log = this.log + " tearDown";
    }

    @SuppressWarnings("unused")
    public void testMethod() {
        wasRun = true;
        this.log = this.log + " testMethod";
    }


}

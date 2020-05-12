package com.codegood.demo;

import com.codegood.unittest.runner.TestRunner;

public class RunTests {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner("com.codegood.demo");
        testRunner.runTests();
    }
}

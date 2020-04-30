package com.codegood.unittest;

public class Playground {
    public static void main(String[] args) {
        new TestCaseTest("testTemplateMethod").run();
        new TestCaseTest("testResult").run();
        new TestCaseTest("testFailedResult").run();
        new TestCaseTest("testFailedResultFormatting").run();
    }
}

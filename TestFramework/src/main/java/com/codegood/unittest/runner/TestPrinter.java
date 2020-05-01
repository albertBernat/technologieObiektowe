package com.codegood.unittest.runner;

public class TestPrinter {

    public void printCurrentTestStatus(String testName, boolean hasPassed) {
        System.out.println(padRight(testName,100,".") + (hasPassed ? "PASSED" : "FAILED"));
    }

    private String padRight(String source, int targetLength, String pad) {
        StringBuilder stringBuilder = new StringBuilder(source);
        for (int currentPosition = source.length(); currentPosition < targetLength; currentPosition+=pad.length()) {
            stringBuilder.append(pad);
        }
        return stringBuilder.toString();
    }
}

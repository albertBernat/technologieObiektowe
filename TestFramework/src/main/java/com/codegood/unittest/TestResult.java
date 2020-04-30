package com.codegood.unittest;

public class TestResult {

    private int runCount = 0;
    private int errorCount = 0;

    public void testStarted() {
        this.runCount++;
    }

    public void testFailed() {
        this.errorCount++;
    }

    public String summary() {
        return String.format("%d run, %d failed", this.runCount, this.errorCount);
    }
}

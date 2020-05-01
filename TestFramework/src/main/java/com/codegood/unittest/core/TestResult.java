package com.codegood.unittest.core;

public class TestResult {

    private int runCount = 0;
    private int errorCount = 0;
    private String lastTestedMethodFullName = "";
    private boolean hasPassed;

    public void testStarted() {
        runCount++;
    }

    public void testFailed() {
        errorCount++;
    }

    public String summary() {
        return String.format("%d run, %d successful, %d failed", runCount,runCount-errorCount, errorCount);
    }

    public void setLastTestedMethodFullName(String lastTestedMethodFullName) {
        this.lastTestedMethodFullName = lastTestedMethodFullName;
    }

    public String getLastTestedMethodFullName() {
        return lastTestedMethodFullName;
    }

    public void setHasPassed(boolean hasPassed) {
        this.hasPassed = hasPassed;
    }

    public boolean isLastTestPassed() {
        return hasPassed;
    }
}

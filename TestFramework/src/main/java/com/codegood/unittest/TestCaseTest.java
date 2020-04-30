package com.codegood.unittest;

public class TestCaseTest extends TestCase {

    private WasRun test;

    public TestCaseTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        this.test = new WasRun("testMethod");
    }

    public void testTemplateMethod() {
        test.run();
        assert "setUp testMethod tearDown".equals(test.log);
    }

    public void testResult() {
        TestResult result = test.run();
        assert "1 run, 0 failed".equals(result.summary());
    }

    public void testFailedResult() {
        WasRun testFailedResult = new WasRun("testBrokenMethod");
        TestResult result = testFailedResult.run();
        assert "1 run, 1 failed".equals(result.summary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assert "1 run, 1 failed".equals(result.summary());
    }

}

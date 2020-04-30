package com.codegood.unittest;

public class TestCaseTest extends TestCase {

    private WasRun test;
    private TestResult testResult;

    public TestCaseTest(String name) {
        super(name);
    }

    @Override
    public void setUp() {
        test = new WasRun("testMethod");
        testResult = new TestResult();
    }

    public void testTemplateMethod() {
        test.run(testResult);
        assert "setUp testMethod tearDown".equals(test.log);
    }

    public void testResult() {
        test.run(testResult);
        assert "1 run, 0 failed".equals(testResult.summary());
    }

    public void testFailedResult() {
        WasRun testFailedResult = new WasRun("testBrokenMethod");
        testFailedResult.run(testResult);
        assert "1 run, 1 failed".equals(testResult.summary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assert "1 run, 1 failed".equals(result.summary());
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        TestResult result = new TestResult();
        suite.run(result);
        assert "2 run, 1 failed".equals(result.summary());
    }

}

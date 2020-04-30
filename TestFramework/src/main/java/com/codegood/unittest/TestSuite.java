package com.codegood.unittest;

import java.util.LinkedList;
import java.util.List;

public class TestSuite {
    private List<TestCase> tests = new LinkedList<>();

    public void add(TestCase test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach(testCase -> testCase.run(result));
    }
}

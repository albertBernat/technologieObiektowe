package com.codegood.unittest.runner;

import com.codegood.unittest.core.Test;
import com.codegood.unittest.core.TestCase;
import com.codegood.unittest.core.TestResult;
import com.codegood.unittest.core.TestSuite;
import org.reflections.Reflections;

import java.util.Set;

public class TestRunner {

    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.runTests();
    }

    public void runTests() {
        Reflections reflections = new Reflections();
        Set<Class<? extends TestCase>> testCases = reflections.getSubTypesOf(TestCase.class);

        testCases.removeIf(testCaseClass -> testCaseClass.getName().equals("com.codegood.unittest.core.WasRun"));
        TestSuite testSuite = new TestSuite();
        testCases.forEach(testSuite::add);
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        System.out.println(testResult.summary());
    }
}

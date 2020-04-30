package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;

public class Playground {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        System.out.println(new TestCaseTest("testTemplateMethod").run().summary());
//        System.out.println(new TestCaseTest("testResult").run().summary());
//        System.out.println(new TestCaseTest("testFailedResult").run().summary());
//        System.out.println(new TestCaseTest("testFailedResultFormatting").run().summary());

        TestSuite testSuite = new TestSuite();
//        testSuite.add(new TestCaseTest("testTemplateMethod"));
//        testSuite.add(new TestCaseTest("testResult"));
//        testSuite.add(new TestCaseTest("testFailedResultFormatting"));
//        testSuite.add(new TestCaseTest("testFailedResult"));
//        testSuite.add(new TestCaseTest("testSuite"));
//        testSuite.add(new TestCaseTest("testTearDownWhenMethodFails"));

        testSuite.add(TestCaseTest.class);
        TestResult result = new TestResult();
        testSuite.run(result);
        System.out.println(result.summary());

    }
}

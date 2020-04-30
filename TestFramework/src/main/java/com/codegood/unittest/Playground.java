package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;

public class Playground {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        new TestCaseTest("testTemplateMethod").run();
    }
}

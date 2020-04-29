package com.codegood.unittest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

    private final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = this.getClass().getMethod(this.name);
        method.invoke(this);
    }
}

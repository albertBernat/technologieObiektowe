package com.codegood.unittest.core;

import java.util.Collection;

public class Assertions {

    public static void assertEquals(Object source, Object toCompare) {
        assert source.equals(toCompare);
    }

    public static void assertTrue(boolean toCompare) {
        assert toCompare;
    }

    public static void assertFalse(boolean toCompare) {
        assert !toCompare;
    }

    public static void hasSize(Collection<?> collection, int size) {
        assertEquals(collection.size(), size);
    }

    public static void isBiggerThan(Collection<?> collection, int size) {
        assert collection.size() > size;
    }

    public static void isBiggerOrEqual(Collection<?> collection, int size) {
        assert collection.size() >= size;
    }

    public static void isLesserThan(Collection<?> collection, int size) {
        assert collection.size() < size;
    }

    public static void isLesserOrEqual(Collection<?> collection, int size) {
        assert collection.size() <= size;
    }

    public static void exceptionOfType(Throwable throwable, Class<? extends Throwable> exceptionType) {
        assertEquals(throwable.getClass(), exceptionType);
    }

    public static void exceptionHasMessage(Throwable throwable, String message) {
        assertEquals(throwable.getMessage(), message);
    }

    public static void exceptionHasMessageContaining(Throwable throwable, String toContain) {
        assert throwable.getMessage().contains(toContain);
    }

    public static void exceptionHasCause(Throwable throwable, Class<? extends Throwable> exceptionType) {
        assertEquals(throwable.getCause().getClass(), exceptionType);
    }
}

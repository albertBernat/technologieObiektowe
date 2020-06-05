package com.codegood.demo;

import java.util.LinkedList;
import java.util.List;

public class MyStack<T> {
    private final List<T> stack;

    public MyStack() {
        this.stack = new LinkedList<>();
    }

    public int getCurrentSize() {
        return stack.size();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new MyStackException("Can't pop empty stack",new RuntimeException());
        }
        return stack.remove(stack.size() -1 );
    }
}


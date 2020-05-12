package com.codegood.demo;

import com.codegood.unittest.core.Test;
import com.codegood.unittest.core.TestCase;

public class MyStackTest extends TestCase {

    public MyStackTest(String name) {
        super(name);
    }

    private MyStack<String> myStack;

    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Override
    public void setUp() {
        this.myStack = new MyStack<>();
    }

    @Test
    public void shouldHaveZeroElementsInStackAfterCreating(){
        //when & then
        assert myStack.getCurrentSize() == 0;
    }

    @Test
    public void shouldHaveThreeElementsWhenThreeElementsAdded() {
        //when
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        //then
        assert myStack.getCurrentSize() == 3;
    }

    @Test
    public void shouldHaveLastAddedElementOnPeekOfStack() {
        //when
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        //then
        assert myStack.peek().equals("3");
    }

    @Test
    public void shouldHaveZeroElementsWhenAllElementsPoppedFromStack() {
        //when
        myStack.push("1");
        myStack.pop();
        //then
        assert myStack.getCurrentSize() == 0;
    }

    @Test
    public void shouldReturnPoppedElement() {
        //when
        myStack.push("1");
        String popped = myStack.pop();
        //then
        assert popped.equals("1");
    }

    @Test
    public void shouldThrowExceptionWhenPoppingEmptyStack() {
        //when & then
        try {
            myStack.pop();
        } catch (RuntimeException e) {
            assert e.getClass().getName().equals(RuntimeException.class.getName());
        }
    }
}

package com.codegood.demo;

import com.codegood.unittest.core.Assertions;
import com.codegood.unittest.core.Test;
import com.codegood.unittest.core.TestCase;

public class MyStackTest extends TestCase {

    public MyStackTest(String name) {
        super(name);
    }

    private MyStack<String> myStack;

    @Override
    public void setUp() {
        this.myStack = new MyStack<>();
    }

    @Test
    public void shouldHaveZeroElementsInStackAfterCreating(){
        //when & then
        Assertions.assertEquals(myStack.getCurrentSize(), 0);
    }

    @Test
    public void shouldHaveThreeElementsWhenThreeElementsAdded() {
        //when
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        //then
        Assertions.assertEquals(myStack.getCurrentSize(),3);
    }

    @Test
    public void shouldHaveLastAddedElementOnPeekOfStack() {
        //when
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        //then
        Assertions.assertEquals(myStack.peek(),"3");
    }

    @Test
    public void shouldHaveZeroElementsWhenAllElementsPoppedFromStack() {
        //when
        myStack.push("1");
        myStack.pop();
        //then
        Assertions.assertEquals(myStack.getCurrentSize(), 0);
    }

    @Test
    public void shouldReturnPoppedElement() {
        //when
        myStack.push("1");
        String popped = myStack.pop();
        //then
        Assertions.assertEquals(popped, "1");
        fail();
    }

    @Test
    public void shouldThrowExceptionWhenPoppingEmptyStack() {
        //when & then
        try {
            myStack.pop();
        } catch (RuntimeException e) {
            Assertions.exceptionOfType(e,MyStackException.class);
            Assertions.exceptionHasMessageContaining(e, "empty");
        }
    }
}

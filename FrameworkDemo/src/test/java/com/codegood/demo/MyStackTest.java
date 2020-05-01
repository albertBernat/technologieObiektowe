package com.codegood.demo;

import com.codegood.unittest.core.Test;
import com.codegood.unittest.core.TestCase;

public class MyStackTest extends TestCase {

    public MyStackTest(String name) {
        super(name);
    }

    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void shouldHaveZeroElementsInStackAfterCreating(){
        //given
        MyStack myStack = new MyStack();

        //when & then
        assert myStack.size == 0;
    }
}

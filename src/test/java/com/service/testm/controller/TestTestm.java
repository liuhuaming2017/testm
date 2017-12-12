package com.service.testm.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestm {

        TestmDelegate testmDelegate = new TestmDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testmDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
package com.service.cptstest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCptstest {

        CptstestDelegate cptstestDelegate = new CptstestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cptstestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
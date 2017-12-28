package com.service.cpts.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCpts {

        CptsDelegate cptsDelegate = new CptsDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cptsDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
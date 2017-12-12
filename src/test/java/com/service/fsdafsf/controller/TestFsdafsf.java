package com.service.fsdafsf.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFsdafsf {

        FsdafsfDelegate fsdafsfDelegate = new FsdafsfDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = fsdafsfDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
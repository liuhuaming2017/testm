package com.service.liuhuaming.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLiuhuaming {

        LiuhuamingDelegate liuhuamingDelegate = new LiuhuamingDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = liuhuamingDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
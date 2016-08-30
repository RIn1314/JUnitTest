package com.skybrain.JUnitTest;

import static org.junit.Assert.*;
import org.junit.*;

import com.skybrain.JUnitTest.HelloWorld;

public class TimeTest{
	
    @Test
    public void testSayTime(){
        assertEquals("2016-08-30",new time().sayTime());
    }
}

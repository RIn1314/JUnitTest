package com.skybrain.JUnitTest;

import static org.junit.Assert.*;
import org.junit.*;

import com.skybrain.JUnitTest.HelloWorld;

public class HelloWorldTest {
	
    @Test
    public void testSayHelloWorld(){
        assertEquals("2",new HelloWorld().sayHelloWorld());
    }
}

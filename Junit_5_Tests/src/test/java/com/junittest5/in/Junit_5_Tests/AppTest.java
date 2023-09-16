package com.junittest5.in.Junit_5_Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)
public class AppTest {
//   private App app;
//   
//	@BeforeEach
//	public void dobeforeMethodCall() {
//		System.out.println("Before");
//		this.app=new App();
//	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
        App app=new App();
        String message =app.mymessage("madhu");
        Assertions.assertEquals("hellomadhu", message);
    }
    
    @Test
    public void validateWithNull() {
    	App app=new App();
    	String message =app.mymessage(null);
        Assertions.assertEquals(null, message);
    }
    
//    @AfterEach
//	public void doAfterMethodCall() {
//    	System.out.println("After");
//		this.app=null;
//	}
    
    
}

package com.tcser.www.sample_project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getMessageTestOutput()
    {
    	 App app=new App();
         String output =app.getMessage("mahesh");
         Assert.assertEquals("hello mahesh", output);
    }
    
    @Test
    public void testNullInput()
    {
    	 App app=new App();
         String output =app.getMessage(null);
         Assert.assertEquals(null, output);
    }
    
    
}

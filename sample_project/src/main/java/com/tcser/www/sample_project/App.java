package com.tcser.www.sample_project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!  This is My First program" );
        
        App app=new App();
        String output =app.getMessage("Sagar");
        System.out.println("output : "+output);
    }
    
    public String getMessage(String msg) {
    	if(msg==null) {
    		return null;
    	}
    	return "hello "+msg;
    }
}

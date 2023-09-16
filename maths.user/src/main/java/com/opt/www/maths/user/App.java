package com.opt.www.maths.user;

import com.opt.www.maths.service.MathsService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	MathsService service =new MathsService();
    	Integer result =service.doArithmaticOpt(10, 20, "mul");
    	System.out.println("Result="+result);
    }
    
}

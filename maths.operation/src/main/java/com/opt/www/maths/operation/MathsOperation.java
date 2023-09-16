package com.opt.www.maths.operation;

/**
 * Hello world!
 *
 */
public class MathsOperation 
{
    public Integer sum(Integer a,Integer b) {
    	if(a!=null &&b!=null) {
    		return a+b;
    		}
    	return null;
    }
    
    public Integer sub(Integer a,Integer b) {
    	if(a!=null &&b!=null) {
    		return a-b;
    		}
    	return null;
    }
    
    public Integer mul(Integer a,Integer b) {
    	if(a!=null &&b!=null) {
    		return a*b;
    		}
    	return null;
    }
    
    public Integer div(Integer a,Integer b) {
    	if(a!=null &&b!=null && b!=0) {
    		return a/b;
    		}
    	return null;
    }
    
}

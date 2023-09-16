package com.opt.www.maths.service;

import com.opt.www.maths.operation.MathsOperation;

/**
 * Hello world!
 *
 */
public class MathsService {
	public Integer doArithmaticOpt(Integer a,Integer b,String opt) {
	   Integer result=null;
	   MathsOperation maths=new MathsOperation();
	   
	   switch (opt) {
	  case "sum":
		  result=maths.sum(a, b);
		break;

	  case "sub":
		  result=maths.sub(a, b);
		break;
	  
	  case "mul":
		  result=maths.mul(a, b);
			break;
	  
	  case "div":
		  result=maths.div(a, b);
			break;
	  
	   default:
		break;
	  
	}
	   
	   return result;
   }
}

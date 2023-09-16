package in.rwl.www.logic_building;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//@RunWith(JUnitPlatform.class)
//@ExtendWith(MockitoExtension.class)
public class NumberOperationsTest {
//	@Mock
//	private NumberService service;   //made mock
//	
//	@InjectMocks
//	NumberOperations obj;  //=new NumberOperations();    //insert mock into NumberOperations obj
	NumberOperations obj=new NumberOperations();
	
   @Test
	public void getSquarePositiveTestCase() {
		
//  NumberOperations obj=new NumberOperations();
		   int result=obj.getSquare(20);
	   Assertions.assertEquals(400, result);
	   
	}
   
   @Test
  	public void getSquareZeroTestCase() {
  		
  //  NumberOperations obj=new NumberOperations();
  	 Object result=obj.getSquare(0);       //Object result=obj.getSquare(0);
  	   Assertions.assertEquals(null, result);
  	   
  	}
   
   
   @Test
	public void getSquareNegativeTestCase() {
		
//  NumberOperations obj=new NumberOperations();
		   Object result=obj.getSquare(null);
		   Assertions.assertNull(result);
	   Assertions.assertEquals(null, result);
	   
	}
   
   @Test
   public void calculatePercentagePositiveTestCase() {
//  NumberOperations obj=new NumberOperations();
	   Integer[]arr= {80,85,90,95,88,87};
	   double result=obj.calculatePercentage(arr);
	   Assertions.assertEquals(87.50,result);
   }
	
   
   @Test
   public void calculatePercentageForNull() {
//  NumberOperations obj=new NumberOperations();
	   Integer[]arr= null;
	   Object result=obj.calculatePercentage(arr);
	   Assertions.assertEquals(null,result);
	Assertions.assertNull(result);
   }
	
//   @Test
//   public void getFactorialPositiveTestcase() {
//	   int num=4;
////    NumberOperations obj=new NumberOperations();
//	   when(service.calculateFactorial(num)).thenReturn(24);
//	     
//	   int result=obj.getFactorial(4);
//	   Assertions.assertEquals(24,result);
//   }
//   
}

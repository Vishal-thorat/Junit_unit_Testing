package in.rwl.www.junit_5_test_cases;

import in.rwl.www.logic_building.NumberOperations;

public class Controller {
public static void main(String[] args) {
	

	NumberOperations obj = new NumberOperations();
	
	Integer result = obj.getSquare(20);
	System.out.println(result);
	
	Integer result1 = obj.getSquare(null);
	System.out.println(result1);
	
	System.out.println("--------------------------");
	
	Integer []arr= {56,78,41,89,67,87};
	Double result2=obj.calculatePercentage(arr);
	System.out.println(result2);
	
	Integer []arr1= {};                              //Integer []arr1= null;
	Double result3=obj.calculatePercentage(arr1);   //Double result3=obj.calculatePercentage(null);
	System.out.println(result3);
	
}
}
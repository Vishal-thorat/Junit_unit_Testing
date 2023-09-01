package maths;

import org.junit.Assert;
import  org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
    @Test
    public void checkResult() {
    	SumTest s=new SumTest();
    	Integer r= s.doSum(10,20);
    	Integer a=30;
    	Assert.assertEquals(a, r);
    }
    
    
    
    private Integer doSum(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}



	@Test
    public void checkResultForNull() {
    	Sum s=new Sum() ;
    	Integer r= s.doSum(10,null);
    	Assert.assertEquals(null, r);
    }
    
}

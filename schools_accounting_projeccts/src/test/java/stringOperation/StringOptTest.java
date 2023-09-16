package stringOperation;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StringOptTest {

	@Test
	public void testResult() {
		StringOpt obj=new StringOpt();
		String result =obj.getFinalString("Swapnil");
		Assert.assertEquals("helloSwapnil", result);
	}
	
	
	@Test
	public void testForNullResult() {
		StringOpt obj=new StringOpt();
		String result =obj.getFinalString(null);
		Assert.assertEquals(null, result);
	}
	

}

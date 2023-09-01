package share.Info;
import org.junit.*;
public class PassMessageTest {

	@Test
	public void validateGetMessageOutput() {
		PassMessage m=new PassMessage();
	String result=	m.getMessage("mahesh"); //"hello mahesh"
	Assert.assertNotNull(result);
	Assert.assertEquals("hellomahesh", result);	
	
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() {
		PassMessage m=new PassMessage();
		m.getMessage(null);
	}
	
	
	@Test
	public void checkedNotNull() {
		PassMessage m=new PassMessage();
		String result=	m.getMessage("abc"); 
		Assert.assertNotNull(result);
	
	}
}

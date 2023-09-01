package share.Info;

public class PassMessage {

	public String getMessage(String msg) {
		if(msg==null) {
		NullPointerException obj=new NullPointerException("Input param is null");
		        throw obj;
		                        //return "Error";  
		}
		
		String finalMsg ="hello"+msg;
		return finalMsg;
		
		//return "hello"  +msg;
		
		
		
	}
	
}

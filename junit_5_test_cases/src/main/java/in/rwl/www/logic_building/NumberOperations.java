package in.rwl.www.logic_building;

public class NumberOperations {
 
	private NumberService service;
	
	public NumberOperations() {
		this.service=new NumberService();
	}
	
	public Integer getSquare(Integer num) {
		if(num!=null && num!=0 ) {
			int square =num*num;
			return square;
		}
		return null;
	}
	
	public Double calculatePercentage(Integer[]marks) {
		if(marks!=null && marks.length >0) {
			
			Double sum=0.0;
			for(int i=0;i<marks.length;i++) {
				sum=sum+marks[i];
			}
			Double percentage=sum/marks.length;
			return percentage;
		}
		return null;
	}
	
	
	public Integer getFactorial(Integer num) {
		if(num!=null &&num==0) {
			return 1;
		}
		if(num!=null) {
			return service.calculateFactorial(num);  //fake call 
		}
		return null;
	}
	
}

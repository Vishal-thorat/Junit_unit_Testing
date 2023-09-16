package in.rwl.www.logic_building;

public class NumberService {
	
	Integer calculateFactorial(Integer num) {
		if(num!=null) {
			Integer factorial =1;
			for(int i=1;i<=num;i++) {
				factorial=factorial*i;
			}
			return factorial;
		}
		return null;
	
	}

}

import java.util.ArrayList;
import java.util.List;

public class FinalTest4 {

	public String solution(int N) {
		
		int l = 0;
		int r = 1;
		int result = 0;
		List<String> output = new ArrayList<String>();
		while(true) 
		{
			if(result == N) {
				break;
			}
			
			if(result > N) {
				return "impossible";
			}
			l = getL(l, r);
			
			
			
		}
		
		
		
		return "";
	}
	
	private int getL(int l,int r) {
		return 2*l-r;
	}
	
	private int getR(int l,int r) {
		return 2*r-l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

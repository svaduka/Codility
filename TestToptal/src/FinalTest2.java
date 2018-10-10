import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FinalTest2 {
	
	public int solution(int[] A) 
	{
		if(A == null || A.length ==0) {
			return 0;
		}
		
		List<Integer> circle = new ArrayList<Integer>();
		
		HashSet<Integer> visitedElement = new HashSet<Integer>();
		int maxElement = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if(!visitedElement.contains(i)) 
			{
				circle=findCircle(i, A);
				if(maxElement < circle.size()) {
					maxElement=circle.size();
				}
				visitedElement.addAll(circle);
			}
			
		}
		return maxElement;
	}
	
	public List<Integer> findCircle(final int StartIdx, int[] A) 
	{
		List<Integer> circle = new ArrayList<Integer>();
		circle.add(StartIdx);
		 int tempStartIdx = StartIdx;
		while(true) {
			int ele = A[tempStartIdx];
			if(ele == StartIdx) {
				return circle;
			}else {
				tempStartIdx = ele;
				circle.add(ele);
			}
			
		}
	}
	
	public static void main(String[] args) {
		FinalTest2 o = new FinalTest2();
		int[] A = {5,4,0,3,1,6,2};
		System.out.println(o.solution(A));
	}

}

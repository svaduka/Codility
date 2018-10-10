
public class FinalTest3 {
	
	
	
	public int solution(int[] A) {
		
		if(A==null || A.length ==0) {
			return 0;
		}
		
		if(A.length==1) {
			return 1;
		}
		
		int maxCount=Integer.MIN_VALUE;
		int count =2;
		boolean isPreviousNegative = Boolean.FALSE;
		
		isPreviousNegative = A[0]-A[1] >0 ? true:false;
		
		for (int i = 1; i < A.length-1; i++) 
		{
			if(isPreviousNegative) 
			{
				if(A[i]<A[i+1]) {
					count = count+1;
					isPreviousNegative=false;
				}else {
					if(maxCount<count) {
						maxCount = count;
//						isPreviousNegative
					}
					isPreviousNegative = true;
					count=2;
				}
//				isPreviousNegative=false;
			}else {
				if(A[i] > A[i+1] ) {
					count = count+1;
					isPreviousNegative=true;
				}else {
					if(maxCount<count) {
						maxCount = count;
					}
					isPreviousNegative = false;
					count=2;
				}
//				isPreviousNegative=true;
			}
			
			
		}
		if(maxCount<count) {
			maxCount = count;
		}
		return maxCount;
	}
	
//	public 

	public static void main(String[] args) {
		int[] A = {9, 4, 2, 10, 7, 8, 8, 1, 9};
		FinalTest3 o = new FinalTest3();
		System.out.println(o.solution(A));
	}

}

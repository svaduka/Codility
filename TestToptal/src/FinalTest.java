import java.util.Arrays;

public class FinalTest {
	 public int solution(int[] A) 
	 {
		 Arrays.sort(A);
		 if(A[A.length-1] <0) {
			 return 1;
		 }
		 for (int i = 1; i < A.length; i++) {
			if( A[i]>0 && A[i-1]>0 && A[i]-A[i-1] > 1) {
				return A[i-1]+1;
			}
		}
		 return A[A.length-1]+1;
	 }

	public static void main(String[] args) {
		int[] A = {0,1,2,3,1,5,6,7,8};
		FinalTest f = new FinalTest();
		System.out.println(f.solution(A));
		

	}

}

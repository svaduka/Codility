import java.util.Arrays;

class Solution {

	public int solution1(int[] A) {

		int maxElement = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			if (maxElement < A[i]) {
				maxElement = A[i];
			}
		}

		return maxElement < 0 ? 1 : maxElement + 1;
		// write your code in Java SE 8
	}

	public int solution(int[] A) {


		Arrays.sort(A);
		
		int ele=Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {
			boolean found = contains((i+1),A);
			if(!found){
				ele= i+1;
				break;
			}
			ele = A[A.length-1]+1;
			
		}

		return ele<0?1:ele;
	}
	
	public boolean contains(int ele, int[] A) {
		for (int j = 0; j < A.length; j++) {
			if(ele == A[j]) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] A = { 1,2,3 };
		System.out.println(s.solution(A));

	}
}

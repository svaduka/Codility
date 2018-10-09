
/**
 * 
 * @author sa356713 
 * 			An array A consisting of N different integers is given. The
 *         array contains integers in the range [1..(N + 1)], which means that
 *         exactly one element is missing.
 * 
 *         Your goal is to find that missing element.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given an array A, returns the value of the missing element.
 * 
 *         For example, given array A such that:
 * 
 *         A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5 the function should return 4, as
 *         it is the missing element.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [0..100,000]; the elements of A are
 *         all distinct; each element of array A is an integer within the range
 *         [1..(N + 1)].
 */
public class PermMissingElem 
{
	public int solution(int[] A) 
	{
		int largeNumber = -1;
		int sum = 0;
		for (int i : A) {
			if(largeNumber < i) {
				largeNumber = i;
			}
			sum = sum+i;
		}
		
		int total = largeNumber * (largeNumber+1)/2;
		
		return total-sum;
	}
	
	public static void main(String[] args) {
		int A[] = {1,2,3,4,6,7,9,5};
		PermMissingElem p = new PermMissingElem();
		System.out.println(p.solution(A));
	}

}

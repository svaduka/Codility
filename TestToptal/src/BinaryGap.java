import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author sa356713
 *
 *         A binary gap within a positive integer N is any maximal sequence of
 *         consecutive zeros that is surrounded by ones at both ends in the
 *         binary representation of N.
 * 
 *         For example, number 9 has binary representation 1001 and contains a
 *         binary gap of length 2. The number 529 has binary representation
 *         1000010001 and contains two binary gaps: one of length 4 and one of
 *         length 3. The number 20 has binary representation 10100 and contains
 *         one binary gap of length 1. The number 15 has binary representation
 *         1111 and has no binary gaps. The number 32 has binary representation
 *         100000 and has no binary gaps.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int N); }
 * 
 *         that, given a positive integer N, returns the length of its longest
 *         binary gap. The function should return 0 if N doesn't contain a
 *         binary gap.
 * 
 *         For example, given N = 1041 the function should return 5, because N
 *         has binary representation 10000010001 and so its longest binary gap
 *         is of length 5. Given N = 32 the function should return 0, because N
 *         has binary representation '100000' and thus no binary gaps.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [1..2,147,483,647].
 * 
 */
public class BinaryGap {

	// 1001
	public int solution(int N) {
		int ele = -1;
		Queue<Integer> binaries = createBinaryStack(N);
		List<Integer> bGaps = new ArrayList<Integer>();
		int binaryGap = 0;
		while (!binaries.isEmpty()) {
			int i = binaries.remove();

			if (i == 1) {
				// if(isOneAlreadyFound) {
				// isOneAlreadyFound = false;
				if (binaryGap > 1) {
					bGaps.add(binaryGap);
					binaryGap = 0;
				}
				// }else {
				// isOneAlreadyFound=true;
				// }
			}
			if (i == 0) {
				binaryGap++;
			}
		}
		if (bGaps.size() != 0) {
			Collections.sort(bGaps);
			ele = bGaps.get(bGaps.size() - 1);
		}
		return ele == -1 ? 0 : ele;
	};

	public Queue<Integer> createBinaryStack(int N) {
		String binaryString = Integer.toBinaryString(N);
		System.out.println("BinaryString --->" + binaryString);
		Queue<Integer> binaryStack = new LinkedList<Integer>();
		for (int i = 0; i < binaryString.length(); i++) {
			binaryStack.add(Character.getNumericValue(binaryString.charAt(i)));
		}

		return binaryStack;
	}

	public static void main(String[] args) {

		BinaryGap b = new BinaryGap();
		System.out.println(b.solution(Integer.MAX_VALUE - 99999));
	}

}

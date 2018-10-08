/**
 * 
 * @author sa356713 
 * 			Problem: Given array A consisting of N integers, return the
 *         reversed array. Solution: We can iterate over the first half of the
 *         array and exchange the elements with those in the second part of the
 *         array.
 */
public class ReverseArray {

	public static int[] reverseArray(int[] inputArray) {
		int len = inputArray.length;
		int[] reversedArray = new int[inputArray.length];

		for (int i = 0; i <= len / 2; i++) {
			int index = len - i - 1;
			reversedArray[i] = inputArray[index];
			reversedArray[index] = inputArray[i];

		}

		return reversedArray;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 8, 4, 5, 6, 4, 5, 6, 7, 8 };
		int[] reverseArray = reverseArray(input);
		for (int i : reverseArray) {
			System.out.println(i);
		}

	}

}

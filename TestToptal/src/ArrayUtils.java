import java.util.Random;

public class ArrayUtils {
	
	public static void main(String[] args) {
		Random r = new Random();
		int out = r.nextInt(Math.abs(100000+1+100000)) + Integer.MAX_VALUE;
		System.out.println(out);
	}

	public static int[] generateTestData(int High, int Low, int arrayLength) {
		long start = System.currentTimeMillis();
		int[] A = new int[arrayLength];
		Random r = new Random();

		for (int i = 0; i < arrayLength; i++) {
			A[i] = r.nextInt(Math.abs(High+1-Low)) + Low;
		}

		long end = System.currentTimeMillis();
		System.out.println("\tData Generation time(MILLIS):" + (end - start));
		return A;
	}

	public static int[] generateSeq(int High, int Low, int arrayLength) {
		long start = System.currentTimeMillis();

		int[] A = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			A[i] = i;
		}
		long end = System.currentTimeMillis();
		System.out.println("\t Data Generation time(MILLIS):" + (end - start));

		return A;
	}

}


public class TestImpl 
{
	public static void testArrayExamples(Test obj) {
		long start = System.currentTimeMillis();
		testArrayMediumRandom1(obj);
		testArrayMediumRandom2(obj);
		testArrayLargeOnes(obj);
		testArrayLargeRandom(obj);
		testArrayLargeSequence(obj);
		testArrayLargeExtreme(obj);
		long end = System.currentTimeMillis();
		
		System.out.println("ALL TEST CASES PASSED IN : "+(end-start));
		
	}

	private static void testArrayMediumRandom1(Test obj) 
	{
		System.out.print("Data for MediumRandom1");

		int[] A = ArrayUtils.generateTestData(100, 0, 10000);
		System.out.print("TEST MediumRandom1");
		testArray(obj, A);
	}

	private static void testArrayMediumRandom2(Test obj) {
		
		System.out.print("Data for MediumRandom2");

		int[] A = ArrayUtils.generateTestData(50, -1000, 10000);
		System.out.print("TEST MediumRandom2");
		testArray(obj, A);
	}

	private static void testArrayLargeOnes(Test obj) {
		System.out.print("Data for LargeOnes");

		int[] A = ArrayUtils.generateTestData(1, -1, 100000);
		System.out.print("TEST LargeOnes");
		testArray(obj, A);
	}

	private static void testArrayLargeRandom(Test obj) {
		System.out.print("Data for LargeRandom");

		int[] A = ArrayUtils.generateTestData(100000, -100000, 100000);
		System.out.print("TEST LargeRandom");
		testArray(obj, A);
	}

	private static void testArrayLargeSequence(Test obj) {
		System.out.print("Data for LargeSequence");

		int[] A = ArrayUtils.generateSeq(100000, 0, 100000);
		System.out.print("TEST LargeSequence");
		testArray(obj, A);
	}
	
	private static void testArrayLargeExtreme(Test obj) {
		System.out.print("Data for LargeExtreme");

		int[] A = ArrayUtils.generateTestData(100000, 0, 100000);
		System.out.print("TEST LargeExtreme");
		testArray(obj, A);
	}
	
	private static void testArray(Test obj, int[] A) {
		long startTime = System.currentTimeMillis();
		
		System.out.print("\toutput:"+obj.solution(A));
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("\t Time Taken(MIILIS):"+(endTime-startTime));
	}

}

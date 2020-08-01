package OOP.src.start;

public class Lab3 {

	public static void printArray(int[] arr, int no) {
		try {
			if (arr.length > 0) {
				for (int i = 0; i < arr.length; i += no) {
					for (int j = 0; (j < no) && (i + j < arr.length); j++) {
						System.out.print(arr[i + j] + "\t");
					}
					System.out.println();
				}
			} else {
				System.out.println("No Data to Print");
			}
		} catch (NullPointerException e) {
			System.out.println("No Data to Print");
		}
	}

	public static boolean isAscending(int[] arr) {
		boolean ans = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1])
				ans = true;
			else
				return false;
		}
		return ans;
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];
		return arr;
	}

	public static double findAverage(int[] arr) {
		if (arr.length == 0)
			return 0;
		else {
			double sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum / arr.length;
		}
	}

	public static int[] selectGreaterthan(int[] inArr, int limit) {
		int size = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] <= limit) {
				size++;
			}
		}
		int[] arr = new int[size];
		int counter = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] > limit) {
				arr[counter] = inArr[i];
				counter++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] testArray = { 7, 12, 1, 0, 5, 8 };
		int[] emptyArray = {};
		int[] anotherArray = { 11, 13, 15, 17, 19, 21, 23, 25 };
		printArray(testArray, 3);
		printArray(emptyArray, 3);
		printArray(null, 3);
		printArray(anotherArray, 4);
		System.out.println("test Average" + findAverage(testArray));
		System.out.println("empty Average" + findAverage(emptyArray));
		anotherArray = selectGreaterthan(testArray, 7);
		System.out.print(">7: ");
		printArray(anotherArray, 2);
		anotherArray = selectGreaterthan(testArray, 77);
		System.out.println(">77: ");
		printArray(anotherArray, 5);
	}
}
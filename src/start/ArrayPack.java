package OOP.src.start;

//Lab 4
import java.util.Scanner;

public class ArrayPack {
	public static int[] readArray(Scanner sc) {
		int[] ans = new int[sc.nextInt()];
		int counter = 0;
		while (sc.hasNextInt() && (counter < ans.length)) {
			ans[counter] = sc.nextInt();
			counter++;
		}
		return ans;
	}

	public static int[] appendArrays(int[] a1, int[] a2) {
		int[] ans = new int[a1.length + a2.length];
		for (int i = 0; i < a1.length; i++) {
			ans[i] = a1[i];
		}
		for (int j = 0; j < a2.length; j++) {
			ans[j + a1.length] = a2[j];
		}
		return ans;
	}

	public static int getMaximalElement(int[] inArr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] > max) {
				max = inArr[i];
			}
		}
		return max;
	}

	public static int getMinimalElement(int[] inArr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] < min) {
				min = inArr[i];
			}
		}
		return min;
	}

	public static int[] getGreaterThan(int[] inArr, int limit) {
		int size = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] > limit) {
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

	public static int[] getLessThan(int[] inArr, int limit) {
		int size = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] < limit) {
				size++;
			}
		}
		int[] arr = new int[size];
		int counter = 0;
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] < limit) {
				arr[counter] = inArr[i];
				counter++;
			}
		}

		return arr;
	}

	public static int[] getRange(int[] inArr, int lowerLimit, int upperLimit) {
		int[] ans = new int[upperLimit - lowerLimit];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = inArr[i + lowerLimit];
		}
		return ans;
	}

	public static boolean isAnElement(int[] inArr, int What2Look4) {
		for (int i = 0; i < inArr.length; i++) {
			if (inArr[i] == What2Look4)
				return true;
		}
		return false;
	}

	public static int[] uniqueElements(int[] a1, int[] a2) {
		int size = 0;
		for (int i = 0; i < a1.length; i++) {
			if (!isAnElement(a2, a1[i]))
				size++;
		}
		int[] ans = new int[size];
		size = 0;
		for (int i = 0; i < a1.length; i++) {
			if (!isAnElement(a2, a1[i])) {
				ans[size] = a1[i];
				size++;
			}
		}
		return ans;
	}

	public static int[] commonElements(int[] a1, int[] a2) {
		int size = 0;
		for (int i = 0; i < a1.length; i++) {
			if (isAnElement(a2, a1[i]))
				size++;
		}
		int[] ans = new int[size];
		size = 0;
		for (int i = 0; i < a1.length; i++) {
			if (isAnElement(a2, a1[i])) {
				ans[size] = a1[i];
				size++;
			}
		}
		return ans;
	}

	public static void showArr(int[] arrIn) {
		for (int i = 0; i < arrIn.length; i++) {
			System.out.print(arrIn[i] + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] test = readArray(input);
		showArr(test);
		input.close();
		int[] demo1 = { 3, 4, 64, 43 };
		int[] demo2 = { 12, 341, 4, 2, 3 };
		showArr(appendArrays(demo1, demo2));
		System.out.println(appendArrays(demo1, demo2)[5]);
		System.out.println(getMaximalElement(demo1));
		System.out.println(getMaximalElement(demo2));
		System.out.println(getMinimalElement(demo1));
		System.out.println(getMinimalElement(demo2));
		System.out.println(getGreaterThan(demo1, 20)[1]);
		System.out.println(getGreaterThan(demo2, 30)[0]);
		System.out.println(getLessThan(demo1, 20)[1]);
		System.out.println(getLessThan(demo2, 30)[0]);
		showArr(getRange(appendArrays(demo1, demo2), 1, 6));
		showArr(getRange(appendArrays(demo1, demo1), 1, 6));
		System.out.println(isAnElement(demo1, 3));
		showArr(uniqueElements(demo2, demo1));
		showArr(commonElements(demo2, demo1));
	}

}
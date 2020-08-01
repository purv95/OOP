package OOP.src.start;

public class Lab5 {
	public static int factorial(int n) {
	// Recursive factorial
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	// Iterative factorial
	public static int ifactorial(int n) {
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}

	// Recursive Greatest Common Divisor
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);

	}

	// Iterative Greatest Common Divisor
	public static int iGcd(int a, int b) {
		int ans = 1;
		if (a > b) {
			for (int i = b; i > 1; i--) {
				if (a % i == 0 && b % i == 0) {
					ans = i;
					break;
				}
			}
		} else {
			for (int i = a; i > 1; i--) {
				if (a % i == 0 && b % i == 0) {
					ans = i;
					break;
				}
			}
		}
		return ans;
	}

	// Iterative
	public static int iNo(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				ans++;
			}
		}
		return ans;
	}

	// Recursive
	public static int no(int[] arr, int n) {
		if (n == 0) {
			if (arr[0] > 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (arr[n] > 0) {
				return 1 + no(arr, n - 1);
			} else {
				return no(arr, n - 1);
			}
		}
	}

	// Recursive
	public static int sum(int[] arr, int n) {
		if (n == 0) {
			if (arr[0] > 0) {
				return arr[0];
			} else {
				return 0;
			}
		} else {
			if (arr[n] > 0) {
				return arr[n] + sum(arr, n - 1);
			} else {
				return sum(arr, n - 1);
			}
		}
	}

	// Iterative method for adding all positive numbers from an array.
	public static int iSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 2, -24, -4, -5, 30, 40 };
		System.out.println(factorial(6));
		System.out.println(ifactorial(3));
		System.out.println(gcd(150, 200));
		System.out.println(iGcd(150, 180));
		System.out.println(iNo(arr));
		System.out.println(iSum(arr));
		System.out.println(no(arr, arr.length - 1));
		System.out.println(sum(arr, arr.length - 1));
	}
}
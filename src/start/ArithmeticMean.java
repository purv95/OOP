package OOP.src.start;

import java.util.Scanner;

public class ArithmeticMean {
	public static void main(String[] args) {
		int sum = 0;
		int elemNo = 0;
		int sumOfInt = 0;
		int maxElem = Integer.MIN_VALUE;
		int minElem = Integer.MAX_VALUE;
		System.out.print("Enter your Numbers or alphabet : ");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int currElem = sc.nextInt();
			if (currElem > 10)
				sumOfInt += currElem;
			while (maxElem < currElem)
				maxElem = currElem;
			while (minElem > currElem)
				minElem = currElem;
			sum += currElem;
			elemNo++;
		}
		if (elemNo == 0) {
			System.err.print("No data available\n");
			System.exit(1);
		}
		sc.close();
		double result = sum / elemNo;
		System.out.println("Mean of entered sequence:  " + elemNo);
		System.out.println(" is " + result + "\n");
		System.out.println("Sum of numbers which are greater then 10: ");
		System.out.println(sumOfInt);
		System.out.println("Max Number is : " + maxElem);
		System.out.println("Min Number is : " + minElem);
		System.exit(0);
	}
}
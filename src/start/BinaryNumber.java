package OOP.src.start;

import java.util.Scanner;
import java.lang.String;

public class BinaryNumber {
	private char[] binary = new char[32];

	// Constructors
	public BinaryNumber(int val) {
		char[] Binary = Integer.toBinaryString(val).toCharArray();
		for (int i = 0; i < Binary.length; i++) {
			this.binary[i] = Binary[i];
		}
	}

	public BinaryNumber(BinaryNumber bn) {
		this.binary = bn.binary;
	}

	public BinaryNumber() {
		this.binary = new char[32];
	}

	public int getInteger() {
		int ans = 0;
		for (int i = 0; i < this.binary.length; i++) {
			ans += Math.pow(2, i) * binary[i];
		}
		return ans;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < this.binary.length; i++) {
			str += binary[i];
		}
		return str;
	}

	public BinaryNumber calcAnd(BinaryNumber other) {
		BinaryNumber ans = new BinaryNumber();
		for (int i = 0; i < this.binary.length; i++) {
			ans.binary[i] = (char) (this.binary[i] & other.binary[i]);
		}
		return ans;
	}

	public BinaryNumber calcAnd(int val) {
		BinaryNumber ans = new BinaryNumber();
		BinaryNumber other = new BinaryNumber(val);
		for (int i = 0; i < this.binary.length; i++) {
			ans.binary[i] = (char) (this.binary[i] & other.binary[i]);
		}
		return ans;
	}

	public static BinaryNumber calcAnd(int fst, int sec) {
		BinaryNumber first = new BinaryNumber(fst);
		BinaryNumber second = new BinaryNumber(sec);
		return first.calcAnd(second);
	}

	public BinaryNumber calcOr(BinaryNumber other) {
		BinaryNumber ans = new BinaryNumber();
		for (int i = 0; i < this.binary.length; i++) {
			ans.binary[i] = (char) (this.binary[i] | other.binary[i]);
		}
		return ans;
	}

	public BinaryNumber calcOr(int val) {
		BinaryNumber ans = new BinaryNumber();
		BinaryNumber other = new BinaryNumber(val);
		for (int i = 0; i < this.binary.length; i++) {
			ans.binary[i] = (char) (this.binary[i] | other.binary[i]);
		}
		return ans;
	}

	public BinaryNumber calcXor(BinaryNumber other) {

		@SuppressWarnings("unused")
		BinaryNumber Input = new BinaryNumber();
		BinaryNumber ans = new BinaryNumber();
		for (int i = 0; i < this.binary.length; i++) {
			ans.binary[i] = (char) (this.binary[i] ^ other.binary[i]);
		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] exp = line.split("[ \t]+");
		sc.close();
		BinaryNumber firstValue = new BinaryNumber(Integer.parseInt(exp[0]));
		BinaryNumber secondValue = new BinaryNumber(Integer.parseInt(exp[2]));
		String operation = exp[1];
		String ans = "";
		switch (operation) {
		case "&&":
			ans = firstValue.calcAnd(secondValue).toString();
			break;
		case "||":
			ans = firstValue.calcOr(secondValue).toString();
			break;
		case "^":
			ans = firstValue.calcXor(secondValue).toString();
			break;
		default:
			System.out.println("Wrong Input Format");
		}
		System.out.print(ans);
	}
}
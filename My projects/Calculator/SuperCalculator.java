package com.point;

import java.util.Scanner;

public class SuperCalculator {

	public static void main(String[] args) {

		var input = new Scanner(System.in);
		System.out.println("Please, write operation:");
		String a = input.nextLine();

		a = checkSymbol(input, a);

		System.out.println("Please, write number one:");
		var b = input.nextInt();
		System.out.println("Please, write number two:");
		var c = input.nextInt();

		switch (a) {
		case "+": {
			sumNumber(b, c);
			break;
		}

		case "-": {
			differenceNumber(b, c);
			break;
		}

		case "*": {
			multiplicationNumber(b, c);
			break;
		}

		case "/": {
			fractionDivisionNumber(b, c);
			break;
		}

		case "div": {
			integerDivisionNumber(b, c);
			break;
		}

		case "mod": {
			divisionWithRemainderNumber(b, c);
			break;
		}

		case "^": {
			exponentiationNumber(b, c);
			break;
		}

		}

	}

	public static void exponentiationNumber(int b, int c) {
		var result = 1;
		var d = Math.abs(c);

		for (var i = 1; i <= d; i += 1) {
			result = result * b;
		}
		
		if (c > 0) {

			System.out.println(result);
		} else {
			System.out.println((float) 1 / result);
		}
	}

	public static void divisionWithRemainderNumber(int b, int c) {
		if (c == 0) {
			System.out.println("Error!");
		} else {
			System.out.println(b % c);
		}
	}

	public static void integerDivisionNumber(int b, int c) {
		if (c == 0) {
			System.out.println("Error!");
		} else {
			System.out.println(b / c);
		}
	}

	public static void fractionDivisionNumber(int b, int c) {
		if (c == 0) {
			System.out.println("Error!");
		} else {
			System.out.println((float) b / c);
		}
	}

	public static void multiplicationNumber(int b, int c) {
		System.out.println(b * c);
	}

	public static void differenceNumber(int b, int c) {
		System.out.println(b - c);
	}

	public static void sumNumber(int b, int c) {
		System.out.println(b + c);
	}

	public static String checkSymbol(Scanner input, String a) {
		while (!a.equals("+") && !a.equals("-") && !a.equals("*") && !a.equals("/") && !a.equals("div")
				&& !a.equals("mod") && !a.equals("^")) {
			System.out.println("You are not write right operation, please repit");
			a = input.nextLine();
		}
		return a;
	}

}
fdhjk
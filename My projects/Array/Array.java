package com.editop;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		var array1 = new int[8];
		var array2 = new int[8];
		
		inputElementFirstArray(input, array1);
//		changeElement(array1, array2);
		System.out.print(array1);
	}

	public static void changeElement(int[] array1, int[] array2) {
		for ( var e = 0; e < array1.length; e++ )
		{
			array1[e] = array2[7-e];
			array2[7-e] = 7 - e + 1;
			System.out.print(array2[7-e] + " ");
		}
	}

	public static void inputElementFirstArray(Scanner input, int[] array1) {
		for ( var i = 0; i < 8; i++) {
			array1[i]= input.nextInt();

		}
	}

}

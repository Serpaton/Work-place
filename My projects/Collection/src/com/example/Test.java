package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		intArray array = new intArray(new Integer[] { 1, 2, 3, 4 });
		intArray arrayy = new intArray(new Integer[] { 0, 0, 0, 0 });
		intArray arrayyy = new intArray(new Integer[] { 9, 8, 7, 3 });
		ArrayList<intArray> aray = new ArrayList<>();
		aray.add(array);
		aray.add(arrayy);
		aray.add(arrayyy);
		Collections.sort(aray);
		for (intArray m : aray) {
			for (int a : m.getArray1()) {
				System.out.print(a);
			}
			System.out.println();
		}

	}

}

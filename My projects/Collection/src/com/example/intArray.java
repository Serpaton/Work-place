package com.example;

public class intArray implements Comparable<intArray> {

	private Integer[] array1;

	public Integer[] getArray1() {
		return array1;
	}

	public void setArray1(Integer[] array1) {
		this.array1 = array1;
	}

	public intArray() {

	}

	public intArray(Integer[] array1) {
		this.array1 = array1;
	}

	public Integer getMax() {
		var max = array1[0];
		for (var i = 0; i < array1.length; i++) {
			if (max < array1[i]) {
				max = array1[i];
			}

		}
		return max;

	}

	public Integer getMin() {
		var min = array1[0];
		for (var i = 0; i < array1.length; i++) {
			if (min < array1[i]) {
				min = array1[i];
			}

		}
		return min;

	}

	@Override
	public int compareTo(intArray o) {
		return this.getMax().compareTo(o.getMin());
	}

}

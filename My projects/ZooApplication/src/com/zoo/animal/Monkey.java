package com.zoo.animal;

import com.zoo.Animal;

import com.zoo.exception.NegativeValuexception;

public class Monkey extends Animal {

	public Monkey() {
	}

	public Monkey(String name, String color) {
		super(name, color);
	}

	public void say() {
		System.out.println("I like banana!");
	}

	public void laugh(String loud) {
		System.out.println("Monkey laugh " + loud + " and loud");

	}

	public void tease(int tease1) throws NegativeValuexception {
		if ( tease1 > 5) {
			throw new NegativeValuexception("She doesn't behave well!!!!");
		}
		else {
		System.out.println("Monkey tease " + tease1 + " pedestrian");
		}
	}

	@Override
	public void calm() {
		System.out.println("I AM HAPPY!");
		
	}

	@Override
	public void eat(String menu) {
		System.out.println("I eat" + menu);
		
	}

	@Override
	public void medical(int tabletosy, String tatlebosy) {
		System.out.println("My hand hurts ;( " + tabletosy + tatlebosy);
		
	}

}

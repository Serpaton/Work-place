package com.zoo.animal;

import com.zoo.Animal;


public class Donkey extends Animal {

	public Donkey() {

	}

	public Donkey(String name, String color) {
		super(name, color);

	}

	public void say() {
		System.out.println("This is my tail");
	}

	public void sit(int sit1) {
		System.out.println("Donkey sit " + sit1 + " minute and worry");

	}

	public void sadness(int sadness1) {
		System.out.println("Donkey sadness " + sadness1 + " day");

	}

	@Override
	public void calm() {
		System.out.println("JUST CHILL!");

	}

	@Override
	public void eat(String menu) {
		System.out.println("I like" + menu);

	}

	@Override
	public void medical(int tabletosy, String tatlebosy) {
		System.out.println("My tail hurts ;( " + tabletosy + tatlebosy);

	}

}

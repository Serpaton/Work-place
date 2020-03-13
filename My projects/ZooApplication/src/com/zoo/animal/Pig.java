package com.zoo.animal;

import com.zoo.Animal;


public class Pig extends Animal  {

	public Pig() {

	}

	public Pig(String name, String color) {
		super(name, color);

	}

	public void say() {
		System.out.println("Let's go bild the house!");
	}

	public void run(int run1) {
		System.out.println("Pig run " + run1 + " kilometres");

	}

	public void build(int build1) {
		System.out.println("Pig build " + build1 + " house");

	}

	@Override
	public void calm() {
		System.out.println("JUST RELAX!");

	}

	@Override
	public void eat(String menu) {
		System.out.println("Acorns" + menu);

	}

	@Override
	public void medical(int tabletosy, String tatlebosy) {
		System.out.println("My piglet hurts ;(" + tabletosy + tatlebosy);

	}

}

package com.zoo.animal;

import com.zoo.Animal;

public class Crocodile extends Animal  {

	public Crocodile() {

	}

	public Crocodile(String name, String color) {
		super(name, color);

	}

	public void say() {
		System.out.println("Where is Cheburashka?");
	}

	public void swim(int swim1) {
		System.out.println("Crocodile swim " + swim1 + " miles");

	}

	public void rest(int rest1) {
		System.out.println("Crocodile rest " + rest1 + " days");

	}

	@Override
	public void calm() {
		System.out.println("JUST A BUZZ!");

	}

	@Override
	public void eat(String menu) {
		System.out.println("I swallow stones" + menu);

	}

	@Override
	public void medical(int tabletosy, String tatlebosy) {
		System.out.println("My stomach hurts ;( " + tabletosy + tatlebosy);

	}

}

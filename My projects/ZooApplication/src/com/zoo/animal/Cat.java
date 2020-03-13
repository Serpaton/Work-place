package com.zoo.animal;

import com.zoo.Animal;


public class Cat extends Animal {

	public Cat() {

	}

	public Cat(String name, String color) {
		super(name, color);
	}

	public void say() {
		System.out.println("Ìÿó");
	}

	public void sleep(int hour) {
		System.out.println("Cat sleep " + hour + " hour");

	}

	public void play(int play1) {
		System.out.println("Cat play " + play1 + " minute");

	}

	@Override
	public void calm() {
		System.out.println("I'M CALM!");

	}

	@Override
	public void eat(String menu) {
		System.out.println("I drink" + menu);

	}

	@Override
	public void medical(int tabletosy, String tatlebosy) {
		System.out.println("My head hurts ;( " + tabletosy + tatlebosy);

	}

}

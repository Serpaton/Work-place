package com.zoo.animal;

import com.zoo.Animal;


public class Rabbit extends Animal  {

	public Rabbit() {

	}

	public Rabbit(String name, String color) {
		super(name, color);

	}

	public void say() {
		System.out.println("Where is MY carrot?");
	}

	public void roar(int roar1) {
		System.out.println("Rabbit roar " + roar1 + " times");

	}

	public void climb(int climb1) {
		System.out.println("Rabbit climb in " + climb1 + " hole");

	}

	@Override
	public void calm() {
		System.out.println("I AM FILLED!");

	}

	@Override
	public void eat(String menu) {
		System.out.println("Carrots are good" + menu);

	}

	@Override
	public void medical(int tabletosy, String tatlebosy) {
		System.out.println("My nouse hurts ;( " + tabletosy + tatlebosy);

	}
}

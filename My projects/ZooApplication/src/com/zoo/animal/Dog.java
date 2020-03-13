package com.zoo.animal;

import com.zoo.Animal;
import com.zoo.exception.NegativeValueException;

public class Dog extends Animal{

	public Dog() {

	}

	public Dog(String name, String color) {
		super(name, color);
	}

	public void say() {
		System.out.println("Ãàâ");

	}

	public void calm() {
		System.out.println("I'M GREAT!");
	}

	public void kick(int sick) {
		System.out.println("Dog kick " + sick + " newtons");
	}

	public void jump(int lendth) {

		System.out.println("Dog jump " + lendth + " metres");

	}

	@Override
	public void eat(String menu) {
		System.out.println("I eat" + menu);
	}

	@Override
	public void medical(int tabletosy, String tatlebosy) throws NegativeValueException {
		if (tabletosy > 10) {
			throw new NegativeValueException("Dangerous for your health");
		}
		else {
			System.out.println("My tought hurts ;( " + tabletosy + tatlebosy);
		}
	}

}

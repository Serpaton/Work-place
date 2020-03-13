package com.zoo;


import com.zoo.exception.NegativeValueException;
import com.zoo.exception.NegativeValuexception;

public abstract class Animal implements FeedAnimals,  MedicalFarm{

	private String name;
	private String color;

	public Animal() {

	}

	public Animal(String name, String color) {
		this.name = name;
		this.color = color;

	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	public abstract void say();

	public abstract void calm();

	public void sleep(int year, int mounth, int day, int minutes) throws NegativeValueException {
		if (year < 0) {
			throw new NegativeValueException("No sleep to negative year(");
		}
		else {
			System.out.println(
					"I slept about " + year + " year " + mounth + " mounth " + day + " day " + minutes + " minutes");
		}
		}

	public void sleep(int year, int mounth) throws NegativeValuexception {
		if (year > 3) {
			throw new NegativeValuexception("No sleep more than needed!");
		}
		else {
			System.out.println("I slept about " + year + " year " + mounth + " mounth");
		}
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Animal other = (Animal) obj;
		if (color == null) {
			if (other.color != null) {
				return false;
				}
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

package com.zoo;

import java.util.HashMap;
import java.util.HashSet;

import com.zoo.animal.Cat;
import com.zoo.animal.Crocodile;
import com.zoo.animal.Dog;
import com.zoo.animal.Donkey;
import com.zoo.animal.Monkey;
import com.zoo.animal.Pig;
import com.zoo.animal.Rabbit;
import com.zoo.exception.NegativeException;
import com.zoo.exception.NegativeForException;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.NegativeValuexception;

public class Zoo {
	protected static Animal allHashSet(Animal animal, HashSet<Animal> hashset)
			throws NegativeException, NegativeForException {
		if (hashset.size() > 4) {
			throw new NegativeException("Volier is full!");
		} else if (!hashset.add(animal)) {
			throw new NegativeForException("Nondiferent animals");
		}
		return animal;
	}

	protected static Boolean animalToVolier(Animal animal, HashMap<String, HashSet<Animal>> zooz, String name)
			throws NegativeException {
		if (!zooz.containsKey(name)) {
			throw new NegativeException("XANA ZHIVOTNYM");
		} else {
			for (var m : zooz.entrySet()) {
				if (m.getKey().equals(name)) {
					m.getValue().add(animal);
				}
			}

			return true;
		}
	}

	public static void main(String[] args) throws NegativeValueException, NegativeException {

		Dog dog1 = new Dog("Doggy", "Black");
		System.out.println(dog1.getName());
		System.out.println(dog1.getColor());
		dog1.say();
		dog1.kick(5);
		dog1.jump(3);
		dog1.calm();
		dog1.eat(" meat bons");
		try {
			dog1.medical(11, " - you tabletosy, but by one!");
		} catch (NegativeValueException med) {
			System.out.println(med.getMessage());
		}
		try {
			dog1.sleep(-1, 4, 3, 2);
		} catch (NegativeValueException ye) {
			System.out.println(ye.getMessage());
		}
		try {
			dog1.sleep(4, 1);
		} catch (NegativeValuexception ye1) {
			System.out.println(ye1.getMessage());
		}
		System.out.println();

		Cat cat1 = new Cat("Catty", "Russet");
		System.out.println(cat1.getName());
		System.out.println(cat1.getColor());
		cat1.say();
		cat1.sleep(4);
		cat1.play(10);
		cat1.calm();
		cat1.eat(" a milk");
		cat1.medical(1, " - you tabletos, only need to immediately");
		System.out.println();

		Cat cat2 = new Cat("Catty", "Russet");
		System.out.println(cat2.getName());
		System.out.println(cat2.getColor());
		cat2.say();
		cat2.sleep(4);
		cat2.play(10);
		cat2.calm();
		cat2.eat(" a milk");
		cat2.medical(1, " - you tabletos, only need to immediately");
		System.out.println();

		Monkey monkey1 = new Monkey("Monny", "Brown");
		System.out.println(monkey1.getName());
		System.out.println(monkey1.getColor());
		monkey1.say();
		monkey1.laugh("long");
		try {
			monkey1.tease(6);
		} catch (NegativeValuexception tes) {
			System.out.println(tes.getMessage());
		}
		monkey1.calm();
		monkey1.eat(" bananas");
		monkey1.medical(1, " - you tabletosy, but right away!");
		System.out.println();

		var donkey1 = new Donkey("Donny", "Grey");
		System.out.println(donkey1.getName());
		System.out.println(donkey1.getColor());
		donkey1.say();
		donkey1.sit(20);
		donkey1.sadness(8);
		donkey1.calm();
		donkey1.eat(" carrots!");
		donkey1.medical(4, " - you tabletosy, with water");
		System.out.println();

		var donkey2 = new Donkey("Donny", "Grey");
		System.out.println(donkey2.getName());
		System.out.println(donkey2.getColor());
		donkey2.say();
		donkey2.sit(20);
		donkey2.sadness(8);
		donkey2.calm();
		donkey2.eat(" carrots!");
		donkey2.medical(4, " - you tabletosy, with water");
		System.out.println();

		var pig1 = new Pig("Nir-Nif", "Pink");
		System.out.println(pig1.getName());
		System.out.println(pig1.getColor());
		pig1.say();
		pig1.run(1);
		pig1.build(1);
		pig1.calm();
		pig1.eat(" are our everything");
		donkey1.medical(5, " - you tabletosy, they're sweet ))");
		System.out.println();

		var crocodile1 = new Crocodile("Gena", "Green");
		System.out.println(crocodile1.getName());
		System.out.println(crocodile1.getColor());
		crocodile1.say();
		crocodile1.swim(7);
		crocodile1.rest(2);
		crocodile1.calm();
		crocodile1.eat(" to sink deeper into the bottom");
		donkey1.medical(6, " - you tabletosy, stones are stones...");
		System.out.println();

		var rabbit1 = new Rabbit("Crosh", "White");
		System.out.println(rabbit1.getName());
		System.out.println(rabbit1.getColor());
		rabbit1.say();
		rabbit1.roar(3);
		rabbit1.climb(1);
		rabbit1.calm();
		rabbit1.eat(" but I will not refuse cabbage");
		donkey1.medical(6, " - you tabletosy, keep the cabbage at plus temperature!");
		System.out.println();

		HashSet<Animal> hashSet = new HashSet<>();
		try {

			allHashSet(dog1, hashSet);
			allHashSet(cat1, hashSet);
			allHashSet(cat2, hashSet);
			allHashSet(crocodile1, hashSet);
			allHashSet(monkey1, hashSet);
			allHashSet(donkey1, hashSet);
			allHashSet(donkey2, hashSet);
			allHashSet(pig1, hashSet);
			allHashSet(rabbit1, hashSet);
		} catch (NegativeException tdd) {
			System.out.println(tdd.getMessage());
		} catch (NegativeForException tdd1) {
			System.out.println(tdd1.getMessage());
		}

		for (Animal hash : hashSet) {
			System.out.println(hash.getName());
		}

		HashMap<String, HashSet<Animal>> zooz = new HashMap<>();

		HashSet<Animal> hashset1 = new HashSet<>();
		HashSet<Animal> hashset2 = new HashSet<>();
		HashSet<Animal> hashset3 = new HashSet<>();

		zooz.put("KLETKA-1", hashset1);
		zooz.put("KLETKA-2", hashset2);
		zooz.put("KLETKA-3", hashset3);

		try {
			animalToVolier(dog1, zooz, "KLETKA-1");
			animalToVolier(cat1, zooz, "KLETKA-1");
			animalToVolier(monkey1, zooz, "KLETKA-2");
			animalToVolier(donkey1, zooz, "KLETKA-2");
			animalToVolier(crocodile1, zooz, "KLETKA-3");
			animalToVolier(pig1, zooz, "KLETKA-3");
			animalToVolier(rabbit1, zooz, "KLETKA-4");
		} catch (NegativeException oop) {
			System.out.println(oop.getMessage());
		}
		for (var m1 : zooz.entrySet()) {
			System.out.println(m1.getKey() + "->");

			for (Animal animal : m1.getValue()) {
				System.out.println(animal.getName());
			}
			System.out.println();
		}

	}

}

package com.example;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadApplication2 {

	public static void main(String[] args) throws InterruptedException {

		var count = new AtomicInteger(0);
		for (int i = 1; i <= 20; i++) {
			int k = i;

			var thread1 = new Thread() {
				public void run() {
					System.out.println("Detail" + k + "-> Potok1");
					count.getAndIncrement();
				}
			};

			var thread2 = new Thread() {
				public void run() {
					System.out.println("Detail" + k + "-> Potok2");
					count.getAndIncrement();
				}
			};

			var thread3 = new Thread() {
				public void run() {
					System.out.println("Detail" + k + "-> Potok3");
					count.getAndIncrement();
				}
			};

			var thread4 = new Thread() {
				public void run() {
					System.out.println("Detail" + k + "-> Potok4");
					count.getAndIncrement();
				}
			};
			var thread5 = new Thread() {
				public void run() {
					System.out.println("Detail" + k + "-> Potok5");
					count.getAndIncrement();
				}
			};

			var thread6 = new Thread() {
				public void run() {
					System.out.println("Detail" + k + "-> Potok6");
					count.getAndIncrement();
				}
			};

			thread1.start();

			thread2.start();

			thread1.join();
			thread2.join();

			thread3.start();
			thread3.join();

			thread4.start();

			thread5.start();

			thread4.join();
			thread5.join();

			thread6.start();
			thread6.join();
		}

	}
}

package com.example;

public class ThreadApplication2 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= 20; i++) {
			int kar = i;

			var thread1 = new Thread() {
				public void run() {
					System.out.println("Detail" + kar + "-> Potok1");
				}
			};

			var thread2 = new Thread() {
				public void run() {
					System.out.println("Detail" + kar + "-> Potok2");
				}
			};

			var thread3 = new Thread() {
				public void run() {
					System.out.println("Detail" + kar + "-> Potok3");
				}
			};

			var thread4 = new Thread() {
				public void run() {
					System.out.println("Detail" + kar + "-> Potok4");
				}
			};
			var thread5 = new Thread() {
				public void run() {
					System.out.println("Detail" + kar + "-> Potok5");
				}
			};

			var thread6 = new Thread() {
				public void run() {
					System.out.println("Detail" + kar + "-> Potok6");
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

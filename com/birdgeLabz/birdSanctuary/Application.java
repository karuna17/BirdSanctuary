package com.birdgeLabz.birdSanctuary;


public class Application {

	public static void main(String[] args) {
		System.out.println("welcome to bird sanctuary");

		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
		
		Parrot parrot1 = new Parrot("p1");
		Duck duck1 = new Duck("d1");
		Penguin penguin1 = new Penguin("pn1");

		birdSanctuaryManager.add(parrot1);
		birdSanctuaryManager.add(duck1);
		birdSanctuaryManager.add(penguin1);
		
		birdSanctuaryManager.print();
		
		birdSanctuaryManager.printEatables();
		birdSanctuaryManager.printFlyables();
		birdSanctuaryManager.printSwimmables();



	}


}

package com.birdgeLabz.birdSanctuary;

public class Application {

	public static void main(String[] args) {
		System.out.println("welcome to bird sanctuary");

		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
		//BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();


		Parrot parrot1 = new Parrot("p1");
		Parrot parrot2 = new Parrot("p2");
		Parrot parrot3 = new Parrot("p3");		
		Parrot parrot4 = new WhiteParrot("p4");

		Duck duck1 = new Duck("d1");
		Duck duck2 = new Duck("d2");
		Duck duck3 = new Duck("d3");

		Penguin penguin1 = new Penguin("pn1");
		Penguin penguin2 = new Penguin("pn2");
		Penguin penguin3  = new Penguin("pn3");

		try {
			birdSanctuaryManager.add(parrot1);
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(parrot2);
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(parrot3);
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(parrot4);
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		try {
			birdSanctuaryManager.add(duck1);
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(duck2);
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(duck3);
		}catch (Exception e) {
			e.printStackTrace();
		}

		try {
			birdSanctuaryManager.add(penguin1);
		}catch (Exception e) {
			e.printStackTrace();
		}	

		try {
			birdSanctuaryManager.add(penguin2);
		}catch (Exception e) {
			e.printStackTrace();
		}	

		try {
			birdSanctuaryManager.add(penguin3);
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
		birdSanctuaryManager.print();
		birdSanctuaryManager.printFlyables();
		birdSanctuaryManager.printSwimmables();

		System.out.println("Parrot: "+Parrot.count);
		System.out.println("Duck: "+Duck.count);
		System.out.println("Penguin: "+Penguin.count);

		birdSanctuaryManager.remove(duck2);
		birdSanctuaryManager.print();

		System.out.println("Parrot: "+Parrot.count);
		System.out.println("Duck: "+Duck.count);
		System.out.println("Penguin: "+Penguin.count);
		
		System.out.println("Total count: "+Birds.totalCount); 

	}
}

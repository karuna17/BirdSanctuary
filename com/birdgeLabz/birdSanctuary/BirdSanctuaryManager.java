package com.birdgeLabz.birdSanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {

	List<Birds> birdList = new ArrayList<Birds>();

	public void add(Birds bird) {    
		birdList.add(bird);
	}

	public void print() {
		for(Birds list: birdList) {
			System.out.println(list);
		}
	}

	public void printFlyables() {
		for(Birds bird: birdList) {
			if(bird instanceof Flyable) {
				((Flyable)bird).fly();
			}
		}
	}

	public void printSwimmables() {      
		for(Birds bird: birdList) {
			if(bird instanceof Swimmable) {
				((Swimmable)bird).swim();
			}
		}
	}

	public void printEatables() {
		for(Birds bird: birdList) {
			bird.eat();
		}
	}
}

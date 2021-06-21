package com.birdgeLabz.birdSanctuary;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BirdSanctuaryManager {
	Set<Birds> birdList = new HashSet<Birds>();
	static	BirdSanctuaryManager birdSanctuary;
/*
	private BirdSanctuaryManager() {
	}

	public static synchronized BirdSanctuaryManager getInstance() {
		if(birdSanctuary == null) {
			return birdSanctuary = new BirdSanctuaryManager();
		}
		return birdSanctuary;		
	} */

	public void add(Birds bird) throws BirdSantuaryException {    
		if(birdList.add(null)) {
			throw new BirdSantuaryException();
		}
		else if(birdList.add(bird)) {
			bird.incrementCount();
			if(birdList.remove(null)) {
				Birds.totalCount++;
			}
		}
	}

	public void remove(Birds bird) {
		if(birdList.remove(bird)) {
			bird.decrementCount();
		}
	}

	public void print() {
		for(Birds list: birdList) {
			System.out.println(list);
		}
	}

	public void printFlyables() {
		birdList.stream().filter(bird -> bird instanceof Flyable).forEach(bird -> ((Flyable)bird).fly());
	}

	public void printSwimmables() { 
		birdList.stream().filter(bird -> bird instanceof Swimmable)
		.collect(Collectors.toList()).forEach(bird -> ((Swimmable) bird).swim());
	}

	public void printEatables() {
		birdList.stream().forEach(bird -> bird.eat());
	}

}

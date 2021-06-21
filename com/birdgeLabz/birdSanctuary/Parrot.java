package com.birdgeLabz.birdSanctuary;

public class Parrot extends Birds implements Flyable{
	static int count=0;

	public Parrot(String id) {
		this.id = id;
		color = Color.GREEN;
	}
	
	@Override
	public void incrementCount() {
		 count++;
	}

	@Override
	public void decrementCount() {
		count--;
	}
	
	@Override
	public void eat() {
		System.out.println("parrot is eating");
	}

	@Override
	public void fly() {
		System.out.println("parrot is flying");
	}

	@Override
	public String toString() {
		return "Parrot [id=" + id + ", color=" + color + "]";
	}	
}

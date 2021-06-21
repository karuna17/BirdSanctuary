package com.birdgeLabz.birdSanctuary;

public class Duck extends Birds implements Flyable, Swimmable{
	
	static int count=0;
	
	public Duck(String id) {
		this.id = id;
		color = Color.WHITE;
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
		System.out.println("Duck is eating");		
	}

	@Override
	public void fly() {
		System.out.println("Duck is flying");		
	}

	@Override
	public void swim() {
		System.out.println("Duck is swimming");
	}

	@Override
	public String toString() {
		return "Duck [id=" + id + ", color=" + color + "]";
	}
}

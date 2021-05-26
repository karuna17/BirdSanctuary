package com.birdgeLabz.birdSanctuary;

public class Duck extends Birds implements Flyable, Swimmable{
	
	String id;
	
	public Duck(String id) {
		this.id = id;
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
		return "Duck [id=" + id + "]";
	}
}

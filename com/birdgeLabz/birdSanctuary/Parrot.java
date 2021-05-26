package com.birdgeLabz.birdSanctuary;

public class Parrot extends Birds implements Flyable{
	String id;
	
	public Parrot(String id) {
		this.id = id;
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
		return "Parrot [id=" + id + "]";
	}
	
}

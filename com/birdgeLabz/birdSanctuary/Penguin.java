package com.birdgeLabz.birdSanctuary;

public class Penguin extends Birds implements Swimmable{

	String id;

	public Penguin(String id) {
		this.id = id;
	}

	@Override
	public void eat() {
		System.out.println("Penguin is eating");		
	}

	@Override
	public void swim() {
		System.out.println("Penguin is swimming");	
	}

	@Override
	public String toString() {
		return "Penguin [id=" + id + "]";
	}


}

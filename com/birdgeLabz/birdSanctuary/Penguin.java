package com.birdgeLabz.birdSanctuary;

public class Penguin extends Birds implements Swimmable{

	static int count=0;
	public Penguin(String id) {
		this.id = id;
		color = Color.WHITE_BLACK;
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
		System.out.println("Penguin is eating");		
	}

	@Override
	public void swim() {
		System.out.println("Penguin is swimming");	
	}

	@Override
	public String toString() {
		return "Penguin [id=" + id + ", color=" + color + "]";
	}
}

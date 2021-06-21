package com.birdgeLabz.birdSanctuary;

public class ToyDuck extends ToyBirds{

	 public ToyDuck() {
		 price = 100;
	}
	
	@Override
	public void sellToyBirds() {
		System.out.println("Price of duck: "+ price);
	}

}

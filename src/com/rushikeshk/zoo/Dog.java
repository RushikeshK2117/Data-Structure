package com.rushikeshk.zoo;

public class Dog extends Animal{

	public Dog(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("Barks");
	}

	@Override
	public void walk() {
		System.out.println("dog walks ");
	}
	
	
	
}

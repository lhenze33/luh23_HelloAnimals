package edu.pitt.assignment1;

public class Bird extends Animal {

	public Bird(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		weight -= 2;
	}

}

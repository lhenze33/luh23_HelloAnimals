package edu.pitt.assignment1;

public class Mammal extends Animal {

	public Mammal(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	public void run() {
		weight -= 1;
	}

}

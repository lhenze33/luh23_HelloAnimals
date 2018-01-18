package edu.pitt.assignment1;

public class Fish extends Animal {

	public Fish(String age, String color, String type, int weight, int minimumWeight) {
		super(age, color, type, weight, minimumWeight);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		weight -= 1;
	}
	

}

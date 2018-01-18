package edu.pitt.assignment1;

public class Animal {
	String age;
	String color;
	String type;
	int weight;
	int minimumWeight;
	
	public Animal(String age, String color, String type, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	public void eat() {
		weight += 1;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void output() {
		System.out.println("The " +type+ " weighs " + weight + " lbs.");
	}
	
}






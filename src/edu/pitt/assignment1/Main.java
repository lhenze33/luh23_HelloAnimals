package edu.pitt.assignment1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Fish fish = new Fish("2","blue","fish",6,2);
		Mammal mammal = new Mammal("4","black","mammal",15,5);
		Bird bird = new Bird("3","red","bird",4,1);
		
		ArrayList<Animal> result = new ArrayList<Animal>();
		result.add(fish);
		result.add(mammal);
		result.add(bird);
		
		fish.eat();
		mammal.eat();
		bird.eat();
		
		fish.swim();
		mammal.run();
		bird.fly();
		
		fish.output();
		mammal.output();
		bird.output();
	}

}

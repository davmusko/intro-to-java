package diceprogram;

import java.util.Random;

public class Die {
	
	//constructor to create die object based on the sides argument
	public Die(int sides) {
		this.sides = sides;
	}
	
	//'properties' of a die
	private int sides;
	private int value;
	
	//auto-generated setters and getters that allow the main method
	//to access private fields(encapsulation)
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	//'functions' of a die
	public void roll() {
		Random rgen = new Random();
		this.value = rgen.nextInt(this.sides) + 1;	
	}
	
	
}

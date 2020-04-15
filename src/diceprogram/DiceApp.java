package diceprogram;

public class DiceApp {
	public static void main(String[] args) {
		//creates die object with 6 sides
		Die d6 = new Die(6); 
		
		//creates die object with 12 sides
		Die d12 = new Die(12);	
		
		// roll method randomizes the value field from 1 to the number of sides
		d6.roll();
		d12.roll();
		
		//prints out value of the dice
		System.out.println(d6.getValue());
		System.out.println(d12.getValue());
	}
}

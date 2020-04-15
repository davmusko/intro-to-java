package day2;

public class FizzBuzz {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9
		
		//use for loop to count to 100
		
		//replace 3's with fizz, 5's with buzz, and both fizzbuzz
		
		for(int i = 1; i < 100;i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if(i % 3 == 0) {
				System.out.println("fizz");
			} else if(i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}		
		}
	}
}

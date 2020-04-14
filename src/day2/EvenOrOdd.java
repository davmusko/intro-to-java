package day2;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		//create some vars
		Scanner scan = new Scanner(System.in);
		int userNum;
		
		//Take in user data
		System.out.println("Please enter a number: ");
		userNum = scan.nextInt();	
		
		//determine if data is odd or even
		//output odd or even
		if(userNum % 2 == 0) {
			System.out.println("Your number is even");
		} 
		if(!(userNum % 2 == 0)){
			System.out.println("your number is odd");
		}

	}
}

package day1;

import java.util.Scanner;

public class AreaCalc {
	public static void main(String[] args) {
		
		//declare a var for x and y
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		int area;

		//take in values for x and y from the user
		System.out.println("Enter a value for x:");
		x = scan.nextInt();
		
		System.out.println("Enter a value for y:");
		y = scan.nextInt();
		
		//calc the area for the rectangle
		area = x * y;
		
		//output the area of the rectangle
		System.out.println("The area of the rectangle: " + area + "cm^2");
		
	}
}

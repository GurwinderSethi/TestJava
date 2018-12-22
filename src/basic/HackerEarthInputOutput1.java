package basic;

import java.util.Scanner;

public class HackerEarthInputOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer between 0 and 10");
		int number = input.nextInt();
		/*
		 * if(number>10 || number<0) {
		 * System.out.println("Please enter a valid number"); }
		 */
		System.out.println("Enter any string having length between 1 and 15");
		String myString = input.next();
		if ((myString.length() <= 15) && (myString.length() >= 1) && (number <= 10) && (number >= 0)) {
			System.out.println(2 * number);
			System.out.println(myString);
		} else {
			System.out.println("Please enter a valid input.");
		}

	}

}

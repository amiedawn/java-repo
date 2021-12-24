package javaRepo;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		//Guessing game:
		//ask a user to input a number
		//store your lucky number in a variable
		//display how many attempts user took to guess your number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		final int LUCKY_NUMBER=4;
		int count=1;
		
		while(true) {
			
			if(number == LUCKY_NUMBER) {
				System.out.println("Correct! It took you " + count + " guesses.");
				break;
			}	
				System.out.println("Guess again");
				number = sc.nextInt();
				count++;
		}		
		
	}
}
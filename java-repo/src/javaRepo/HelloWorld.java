package javaRepo;

import java.util.Scanner;

public class HelloWorld {
	static int d = 45;
	public static void main(String[] args) {
		// ACCESS SPECIFIERS: 	public: can be accessed from anywhere (other projects or programs if they have your library)
		//						protected: can be accessible within the same package and from subclasses outside of the package
		//						default: when you don't specify anything
		// 						private: most restricted; it is accessible within the same class
		
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//		
//		if(number % 2 ==0) {
//			System.out.println("You have entered an even number");
//		} else {
//			System.out.println("You have entered an odd number");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//		
//		if(number % 2 ==0 && number > 10) {
//			System.out.println("You have entered an even number that is greater than 10");
//		} else if(number%3==0) {
//			System.out.println("You have entered a multiple of 3");
//		}
//		
//		else {
//			System.out.println("You have entered an odd number");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//		
//		
//		while (number <=10) {
//			System.out.println(2*number);
//			number++;
//		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//
//		int i=1; //initialization
//		
//		while (i <=10) {
//			System.out.println(number * i);
//			i++;
//		}
		
		// **use this if you are searching for a number
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//		//infinite while loop:
//		while(true) {
//			System.out.println("inside an infinite loop");
//			if(number>10) {
//				
//				break;
//			}
//			number++;
//		}
		
		//infinite for loop
//		for(;;) {
//		
//		}
		
		
		//Guessing game:
		//ask a user to input a number
		//store your lucky number in a variable
		//display how many attempts user took to guess your number
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//		final int LUCKY_NUMBER=4;
//		int count=0;
//		
//		while(true) {
//			System.out.println("Guess again");
//			if(number != LUCKY_NUMBER) {
//				count++;
//				break;
//			}
//			number++;
//			System.out.println("Correct! It took you " + number + "guesses.");
//			
//		}
		
		
		// constant in java:
		//final int LUCKY_NUMBER = 12;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int number = sc.nextInt();
//
//		for(int i=1; i<=10; i++) //initialization
//			{
//			System.out.println(number + "*" + i+"="+number * i);
//		}
//		
		
		int i;
		i=3;  // you have to initialize it or won't compile
		System.out.println("value of i is:"+i);
		
		
		
//		d=d+5;
//		byte c = 23;
//		int i=c; // implicit
//		byte b = (byte)i;// explicit type-casting
//		float salary = 3000.5f;
//		String name = "David";
//		char grade = 'A';
//		System.out.println("Hello World from Mars");
//		System.out.println();
	}
}
//*********************************************************************
// Demonstrates the use of the nextLine method of the Scanner class 
// to read a string from the user
//*********************************************************************

import java.util.Scanner;

public class Listing2_11

{
		/**  Reads a character string from the user and prints it.   */
	 
	public static void main(String[] args) 
	{
		String message;
		String word;
		int num;
		Scanner scan = new Scanner (System.in);
		
		// Prompt the user to enter a character string
		// and read the input as one character string
		
		System.out.print("Enter a line of text:");
		message = scan.nextLine();
		System .out.println("You entered: \"" + message + "\"");
		System.out.print("Enter an integer: ");
		num=scan.nextInt();
		System.out.println("The number entered: " + num);
		
		// Prompt the user to enter a character string
		// and read the input one token at a time
		
		
		System.out.print("Enter a character string consisting of three words: ");
		
		word = scan.next();
		System.out.println("First word entered: \"" + word + "\"");
		
		word = scan.next();
		System.out.println("Second word entered: \"" + word + "\"");
		
		word = scan.next();
		System.out.println("Third word entered: \"" + word + "\"");
			
		System.out.println("Enter an integer: ");
		int num1=scan.nextInt();
		System.out.println("The number entered: " + num1);
		
	}

}

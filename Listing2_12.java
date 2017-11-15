//**************************************************************************
//  Demonstrates a calculation based on user input.
//**************************************************************************

import java.util.Scanner;

public class Listing2_12
{

	/*  Determines the root of a quadratic equation  */
	 
	 	public static void main(String[] args)
	 	{
	 		int a,b,c;   //  ax^2 + bx + c
	 		Scanner scan = new Scanner(System.in);
	 		
	 		//Prompt the user for the coefficients
	 		
	 		System.out.print("Enter the coefficient of x squared: ");
	 		a = scan.nextInt();
	 			 	
	 		System.out.print("Enter the coefficient of x: ");
	 		b = scan.nextInt();
	 		
	 		System.out.print("Enter the constant: ");
	 		c = scan.nextInt();
	 		
	 		
	 		// If you want the user to enter multiple inputs on one line
	 		// you could do the following
	 		
	 		System.out.println("Enter the coefficients a, b, c for the quadratic equation on one line. ");
	 		System.out.print("Separate the coefficients with spaces: ");
	 		a = scan.nextInt();
	 		b = scan.nextInt();
	 		c = scan.nextInt();
	 		
	 	
	 		System.out.println(a + " " + b  + " " + c);
	 		
	 		// Use the quadratic formula to compute the roots.
	 		// Assumes a positive discriminant. (use a=2, b=4, c = 2 for demo)
	 		
	 		
	 		double discriminant = Math.pow(b,2) - (4 * a * c);
	 		double root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
	 		double root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
	 		
	 		System.out.println("Root #1: " + root1);
	 		System.out.println("Root #2: " + root2);
	 		

	}

}

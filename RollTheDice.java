
    /********************************************************
	 Demonstrates simulating the roll of a pair of dice
	 using the Random class.	 
	 ********************************************************/

import java.util.Random;

public class RollTheDice
{

	// A pair of dice will be rolled and the total accumulated
	
	public static void main(String[] args)
	{
		Random generator = new Random();
		int die1, die2;
		int total;
		
		// must increment the numbers randomly generated so that the
		// range is between 1 & 6
		
		die1 = generator.nextInt(6) + 1;
		System.out.println("Die #1: " + die1);
		
		die2 = generator.nextInt(6) + 1;
		System.out.println("Die #2: " + die2);
		
		// sum up the two dice and print the total
		total = die1 + die2;
		System.out.println("The sum of the pair of dice rolled: " + total);
	}

}

//****************************************************************************************
//  Produces a random phone number with various constraints
//****************************************************************************************

import java.util.Random;
import java.util.Scanner;

public class Prog2_13Play 
{
	
	public static void main(String[] args)
	{
		Random generator = new Random();
		int threeDigit, fourDigit;
		double double3Digit, double4Digit;
		String numString;
		Integer numInteger;
		Double numDouble;
		String phoneNum;
		
	for (int x = 1; x <= 100; x++)
	{
		
		/* First 3 digits can be anything other than an 8 or 9 */
		phoneNum = "" +  generator.nextInt(8) + generator.nextInt(8) + generator.nextInt(8);
		
		/* Next 3 digits cannot be higher than 742. Need to convert to string so that any leading zeroes
		 * will not be lost in printing. */
		threeDigit = generator.nextInt(743);
		threeDigit = threeDigit + 1000;
		numInteger = threeDigit;
		numString = numInteger.toString();
		numString = numString.substring(1);
		phoneNum = phoneNum + "-" + numString;
		
		/* Last 4 digits can be any digits from 0 to 9. Need to convert to string so that any leading zeroes
		 * will not be lost in printing. */
		fourDigit = generator.nextInt(10000);
		fourDigit = fourDigit + 10000;
		numInteger = fourDigit;
		numString = numInteger.toString();
		numString = numString.substring(1);
		phoneNum = phoneNum + "-" + numString;
		
		//double3Digit = threeDigit / 1000.0;
		//double3Digit = double3Digit + .0001;  // This ensures not to lose ending zeroes
		//numDouble = double3Digit;
		//numString = numDouble.toString();
		//numString = numString.substring(2,5);
		//phoneNum = phoneNum + "-" + numString;
		
		//fourDigit = generator.nextInt(10000);
		//double4Digit = fourDigit / 10000.0;
		//double4Digit = double4Digit + .00001;  // This ensures not to lose ending zeroes
		//numDouble = double4Digit;
		//numString = numDouble.toString();
		//numString = numString.substring(2,6);
		//phoneNum = phoneNum + "-" + numString;
	
		System.out.println(phoneNum);
	}
		
		

	}
}

		
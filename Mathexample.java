
   /* This program will demonstrate some methods of the Math class */

public class Mathexample 
{

	public static void main(String[] args) 
	{
		// Using the absolute value method
		
		int num1 = 9;
		double negNum = -10.7;
		int absValueInt;
		double absValueDouble;
		
		/*absValueInt = Math.abs(num1);
		System.out.println("The absolute value of " + num1 + " = " + absValueInt);
		absValueDouble = Math.abs(negNum);
		System.out.println("The absolute value of " + negNum + " = " + absValueDouble);
		*/
		// Rounding up as opposed to rounding down - not to be confused 
		// with a rounding routine!
		
		double num2 = 14.2;
		double numRoundUp;
		double numRoundDown;
		
		/*numRoundUp = Math.ceil(num2);
		System.out.println(num2 + " rounded up = " + numRoundUp);		

		numRoundDown = Math.floor(num2);
		System.out.println(num2 + " rounded down = " + numRoundDown);
		*/
		
		// Raising a number to a power and finding a square root of a number
		
		double num3 = 2;
		double power = 6;
		double numRaisedPower;
		double squareRootNum;
		
		numRaisedPower = Math.pow(num3,power);
		System.out.println(num3 + " raised to a power of " + power + " = " + numRaisedPower);
		
		squareRootNum = Math.sqrt(numRaisedPower);
		System.out.println("The square root of " + numRaisedPower + " = " + squareRootNum);

		double pie; 
		pie = Math.PI;
		System.out.println(pie);
		

	}

}

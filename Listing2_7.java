
//****************************************************************************************************
//   Demonstrates the use of primitive data types and arithmetic expressions.
//****************************************************************************************************

public class Listing2_7
{
    //------------------------------------------------------------------------------------------------
	//          Computes the Fahrenheit equivalent of a specific Celsius
	//          value using the formula  F = (9/5)C + 32.
	//-----------------------------------------------------------------------------------------------
	
	public static void main(String[] args)
	{
	        final int BASE = 32;
	       
	        final double CONVERSION_FACTOR = 9.0/5;
	        //System.out.println((int)CONVERSION_FACTOR);
	        System.out.println(CONVERSION_FACTOR);
	        System.out.println((double)BASE);
	        
	        int celsiusTemp=24;
	        double fahrenheitTemp;
	        
	        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
	        
	        System.out.println("Celsius Temperature: " + celsiusTemp);
	        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);

	}

}

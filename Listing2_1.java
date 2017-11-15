//*****************************************************************************
//	Countdown.java
//
//	Demonstrates the difference between print and println.
//*****************************************************************************

public class Listing2_1
{
	//-------------------------------------------------------------------------
	//	Prints two lines of output representing a rocket countdown.
	//-------------------------------------------------------------------------
	
	public static void main(String[] args)
	{
		
		System.out.print("Three. . .");
		System.out.print("Two. . .");
		System.out.print("One. . .");
		System.out.print("Zero. . .");
		System.out.println();
				
		System.out.print("Liftoff! ");  //appears on first output line
		System.out.println("Houston, we have a problem.");
	}

}

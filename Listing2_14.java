//***********************************************************************************************
//    Demonstrates the formatting of decimal values
//    using the DecimalFormat class.
//***********************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Listing2_14
{
     //*************************************************************************
     //  Calculates the area and circumference of a circle
	 //  given its radius
	 //*************************************************************************

	public static void main(String[] args)
	{
	   double radius;
	   double area, circumference;
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.print("Enter the circle's radius: ");
	   radius = scan.nextDouble();
	   
	   area = Math.PI * Math.pow(radius, 2);
	   circumference = 2 * Math.PI * radius;   // circumgerence = 2 Pi r
	   
	   DecimalFormat fmt = new DecimalFormat("#.000");
	   DecimalFormat fmt3 = new DecimalFormat("0.000");
	   
	   System.out.println("The circle's area: " + fmt.format(area));
	   System.out.println("The circle's circumference: "
			   + fmt.format(circumference));
	   
	   System.out.println("The circle's area: " + fmt3.format(area));
	   System.out.println("The circle's circumference: "
			   + fmt3.format(circumference));
	   
	   
	  // When you use zero in the pattern it will always print that place, whether it is a zero or not
	   
	  DecimalFormat fmt2 = new DecimalFormat("000.0000");
	  DecimalFormat fmt4 = new DecimalFormat("#.0000");
	  DecimalFormat fmt5 = new DecimalFormat("#.#");
	  System.out.println(fmt2.format(.1));
	  System.out.println(fmt4.format(0.270019));
	  System.out.println(fmt2.format(2222220.67868786875687));
	  System.out.println(fmt5.format(1.99));
	  

	}

}

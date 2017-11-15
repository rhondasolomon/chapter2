//***********************************************************************************************
//Demonstrates the use of various Scanner and NumberFormat
//***********************************************************************************************


import java.util.Scanner;
import java.text.NumberFormat;


public class Listing2_13
{
	//********************************************************************************************
	//  Calculates the final price of a purchased item using
	//  values entered by the user.
	//********************************************************************************************
	
	public static void main(String[] args)
		
	{
		final double TAX_RATE = 0.06;  //  6% sales tax
		
		int quantity;
		double subtotal, tax, totalCost, unitPrice;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the quantity: ");
		quantity = scan.nextInt();
		
		System.out.print("Enter the unit price: ");
		unitPrice = scan.nextDouble();
		
		subtotal = quantity * unitPrice;
		tax = subtotal * TAX_RATE;
		totalCost = subtotal + tax;
		
		// Print with appropriate formatting
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.println("Subtotal: " + money.format(subtotal));
		System.out.println("Tax: " + money.format(tax) + " at "
				+ percent.format(TAX_RATE));
		System.out.println("Total: " + money.format(totalCost));
		System.out.println(money.format(45.886888886721));
		System.out.println(percent.format(.08187));
	}

}

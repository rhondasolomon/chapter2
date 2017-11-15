//****************************************************************************************
//  Produces a random phone number with various constraints
//****************************************************************************************

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Prog2_13 
{
	
	public static void main(String[] args)
	{
		Random generator = new Random();
		int threeDigit, fourDigit;
		String phoneNum;
		DecimalFormat fmt = new DecimalFormat("000");
		DecimalFormat fmt1 = new DecimalFormat("0000");
		phoneNum = "" +  generator.nextInt(8) + generator.nextInt(8) + generator.nextInt(8);
		threeDigit = generator.nextInt(743);
		fourDigit = generator.nextInt(10000);
				
		
		phoneNum = phoneNum + "-" + fmt.format(threeDigit) + "-" + fmt1.format(fourDigit);
		System.out.println(phoneNum);

	}
}

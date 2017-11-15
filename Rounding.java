
// This program will demonstrate various rounding routines
public class Rounding 
{
	
	public static void main(String[] args) 
	{
	   //  Rounding to the nearest integer
		
		double num1 = 15.3217;
		double num2 = 15.6894;
		
        //	Add .5 and truncate that number so that you now have an integer.
		
		double temp = num1 + .5;

		int roundedNum = (int)temp;
		System.out.println(num1 + " rounded to the nearest integer = " + roundedNum);
		

		temp = num2 + .5;
		
		roundedNum = (int)temp;
		System.out.println(num2 + " rounded to the nearest integer = " + roundedNum);
		
		System.out.println(); 
		
        //   Rounding to the nearest tenth
		
        //	 Increment the hundredth's place by 5, multiply by 10,
		//   truncate the result, you now got rid of the excess decimals
		
		temp = num1 + .05;
		double holdDec = (int) (temp * 10);
		holdDec = holdDec / 10;
		System.out.println(num1 + " rounded to the nearest tenth= " + holdDec);
		
		temp = num2 + .05;
		holdDec = (int) (temp * 10);
		holdDec = holdDec / 10;
		System.out.println(num2 + " rounded to the nearest tenth = " + holdDec);	
		
		System.out.println();

        //   Rounding to the nearest hundredth
		
		//   Increment the thousandth's place by 5, multiply by 100,
		//   truncate the result, you now got rid of the excess decimals
		
		temp = num1 + .005;
		holdDec = (int) (temp * 100);
		holdDec = holdDec / 100;
		System.out.println(num1 + " rounded to the nearest hundredth = " + holdDec);
		
		temp = num2 + .005;
		holdDec = (int) (temp * 100);
		holdDec = holdDec / 100;
		System.out.println(num2 + " rounded to the nearest hundredth = " + holdDec);
	}

}

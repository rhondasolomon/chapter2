
public class Test2Open 
{

	public static void main(String[] args) 
	{
		System.out.println("'");
		System.out.println("\'");
		
		System.out.println("/'\\\"/'\\");
		System.out.println("/" + "\'" + "\\" + "\"" + "/" + "\'" + "\\");
		System.out.println("/\'\\\"/\'\\");
		System.out.println("/\'\"/\'\\");
		//System.out.println("\/" + "\'" + "\\" + "\"" + "\/" + "\'" + "\\");
		System.out.println("//\'\\\"//\'\\");
		
		//System.out.println("/'\\"/'\\");
		
		//int z = 5/10.0;
		
		/*
		String a = "1",  b = "2";
		int y = 3, z = 4;
		System.out.println(a + b + y + z);
		System.out.println(y + z + a + b);
		*/
		
		
		int a = 5, b = 4;
		double x = 5.0, y = 4.0;
		System.out.println((int)(x/y));
		System.out.println((int)x/y);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(x%y);
		
		
		
		int iResult, num1 = 30, num2 = 55, num3 = 19, num4 =5;
		double fResult, val1 = 19.0, val2 = 10.0;

		iResult = num2 % num1;
		System.out.println(iResult);
		iResult = num1 / num4;
		System.out.println(iResult);
		fResult = num1 / num4;
		System.out.println(fResult);
		iResult = num3 / num4;
		System.out.println(iResult);
		fResult = val1 / num3;
		System.out.println(fResult);
		iResult = (int)(val1 / num4);
		System.out.println(iResult);
		iResult = num4 % num3;
		System.out.println(iResult);
		
		
		
		String g1, g2, g3;
		g1 = "If at first you don't succeed,";
		g2 = "then skydiving is not for you.";
		g1 = g1.toUpperCase();
		g3 = g1 + " " + g2;
		System.out.println("\"" + g3.replace('o','!') + "\"");
		int z = (int)(50/10.0);
		System.out.println(z);
		
		
	}

}

package Package_1;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args)
	{
	  float cel, far;

	Scanner s=new Scanner(System.in);
	System.out.println("Enter temp. in Fahrenheit :");
	far=s.nextInt();

	 cel = (far - 32) * 5/9;

	System.out.println("Temp. in Celsius: "+cel);
	}

	
}

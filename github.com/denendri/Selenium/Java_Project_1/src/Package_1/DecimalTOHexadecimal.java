package Package_1;

import java.util.Scanner;

public class DecimalTOHexadecimal {
	public static void main(String[] args) 
	{

	 //user Scanner class to read data from keyboard
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any Integer: ");
	 int i = sc.nextInt();
	 Integer io = Integer.valueOf(i);
	 String st = Integer.toBinaryString(i);

	 System.out.println("Hexa Decimal for "+i+" is: "+io.toHexString(i));
	 }
}

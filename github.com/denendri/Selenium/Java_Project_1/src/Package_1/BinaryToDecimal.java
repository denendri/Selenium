package Package_1;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) 
	 {
	 Scanner in = new Scanner( System.in );
	 System.out.println("Enter a Binary Number: ");
	 
	int  binarynum =in.nextInt();
	int binary=binarynum;

	int decimal = 0;
	int power = 0;
	 
	while(true)
	{
	 if(binary == 0)
	 {
	 break;
	 }
	 else 
	 {
	  int tmp = binary%10;
	  decimal += tmp*Math.pow(2, power);
	  binary = binary/10;
	  power++;
	 }
	}
	  System.out.println("Binary="+binary+" Decimal="+decimal); ;
	}

}

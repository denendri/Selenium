package Package_1;

import java.util.Scanner;

public class BinaryToHexaDecimal {
	
	public static void main(String args[])
	 {
	  int binnum, rem;
	  String hexdecnum="";
	        
	  // digits in hexadecimal number system
	        
	   char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   Scanner scan = new Scanner(System.in);
			
	   System.out.print("Enter Binary Number : ");
	   binnum = scan.nextInt();
			
	   // converting the number in hexadecimal format
	   while(binnum>0)
	   {
	    rem = binnum%16;
	    hexdecnum = hex[rem] + hexdecnum;
	     binnum = binnum/16;
	   }
			
	   System.out.print("Equivalent Hexadecimal Value of " +binnum+ " is :\n");
	   System.out.print(hexdecnum);
	 }


}

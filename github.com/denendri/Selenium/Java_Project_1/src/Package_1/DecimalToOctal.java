package Package_1;

import java.util.Scanner;

public class DecimalToOctal {
	
	  public static void main(String args[])
	  {
	    Scanner input = new Scanner( System.in );
	    System.out.print("Enter a decimal number : ");
	    int num =input.nextInt();
	 
	    String octalString = Integer.toOctalString(num);
	    System.out.println("Method 1: Decimal to octal: " + octalString);

	  }

}

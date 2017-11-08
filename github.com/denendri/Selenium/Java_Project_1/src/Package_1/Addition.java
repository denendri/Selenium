
package Package_1;

import java.util.Scanner;

public class Addition {
	 public static void main(String[] args)
	{
	    int a, b, c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Sum: "+c);
		}
}

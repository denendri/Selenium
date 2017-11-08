package Package_1;

import java.util.Scanner;

public class Ex1_3 {
	
	public static void main(String[] args) 
    {
	      Scanner in = new Scanner(System.in);
	      System.out.print("Input an integer: ");
	      int x = in.nextInt();
	      
	      if (x >= 1 && x <= 28)
	        {
	            System.out.println("Category A - Number accepted!");
	        }
	      else if (x >= 30)
	        {
	            System.out.println("Category B - Number accepted!");
	        }

	      else
	        {
	            System.out.println("Invalid Input!");
	        }
		 } 
    }

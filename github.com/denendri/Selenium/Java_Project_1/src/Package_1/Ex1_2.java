package Package_1;

import java.util.Scanner;
 
public class Ex1_2
{
    public static void main(String[] args)
    {

    	int noOfRows = 7;
         
        int midRow = (noOfRows)/2;
  
        int row = 1;
          
        for (int i = midRow; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
  
            for (int j = 1; j <= row; j++)
            {
                System.out.print("* ");
            }
  
            System.out.println();
 
            row++;
        }
                  
        for (int i = 0; i <= midRow; i++) 
        { 
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" ");
            }
             
            for (int j = row; j > 0; j--) 
            {
                    System.out.print("* ");
            }
             
            System.out.println();
     
            row--;
        }
    }
}
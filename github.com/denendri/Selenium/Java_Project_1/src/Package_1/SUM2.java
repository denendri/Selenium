package Package_1;

public class SUM2{
	
	public static void main(String args[]) {
    
		int arrayLength = args.length;
    
		int sum = 0;
    
    for(int loop = 0 ; loop<arrayLength ; loop++)
    {
           System.out.println("You have input Number " + (loop + 1 ) + " as: " + args[loop]);
           sum = sum + Integer.parseInt(args[loop]);
    }
    
    System.out.println("Sum is :" + sum);
    System.out.println("Average is :" + (sum/arrayLength));
    
	}

}

package Package_1;

public class NULL {
	
	public static void main(String args[]) {
	    
		//int x;
		
		//String s = null;
    
   // System.out.println("Sum1 is :" + (y = x / 5));

  //  System.out.println("Sum1 is :" + (100 / 0));
    /*
    try
    {
    	System.out.println("Length of sampleString is :" + s.length());
    }catch (NullPointerException exception)
    {
    	System.out.println("Cannot get the length of a null String" );
    }finally
    {  	
    }
    */
		
		try
		{
			int a[]= new int[5];
			a[5]=30/10;
			
		}catch (ArithmeticException e)
		{
			System.out.println("Division By Zero is not allowed" );
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Trying to access an element in the array which is out of bounds" );
		}catch (Exception e)
		{
			System.out.println("Common Exception Occured" );
		}
		
		
	}

}
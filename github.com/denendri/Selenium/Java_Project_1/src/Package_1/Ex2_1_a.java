package Package_1;

public class Ex2_1_a {
	public static void main (String[] args){
		try{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e){
			System.out.println("Division by Zero is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Trying to accesss an element in the array which is out of bounds");
		}
		catch(Exception e)
		{
			System.out.println("Common Exception Occured");
		}
		}
	}

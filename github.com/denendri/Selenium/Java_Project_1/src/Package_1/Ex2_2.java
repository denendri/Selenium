package Package_1;

public class Ex2_2 {
	static void check() throws ArithmeticException
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("Throw Arithmetic Exception");
	}
	
	public static void main(String args[])
	{
		try{
			check();
		}catch(ArithmeticException e)
		{
			System.out.println("caught " + e);
		}
		}
	}

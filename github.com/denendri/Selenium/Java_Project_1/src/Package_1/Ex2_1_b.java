package Package_1;

public class Ex2_1_b {
	
	public static void main(String[] args)
	{
		String sampleString=null;
		try{
			System.out.println("Lenght of sampleString is:"+sampleString.length());
		}catch(NullPointerException exception)
		{
			System.out.println("Cannot get the Lenght of a null String");
		}finally{	
		}
	}
}

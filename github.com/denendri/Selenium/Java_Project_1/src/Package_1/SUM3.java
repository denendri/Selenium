package Package_1;

public class SUM3 {
	
	public static void main(String args[]) {
	    
		int x = 10;
		
		int y = 2;
    
    System.out.println("Sum1 is :" + (x += 5));
    System.out.println("Sum2 is :" + (x =+ 5));
    
    //System.out.println("Sum3 is :" + (y = y-- ));
    
    System.out.println("Sum3 is :" + ( y-- ));
    System.out.println("Sum4 is :" + ( --y ));
    
	}

}

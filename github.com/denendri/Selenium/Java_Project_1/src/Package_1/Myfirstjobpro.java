package Package_1;

public class Myfirstjobpro {
	
	public static void main(String[] args) {

		for(int x = 0 ; x<=10 ; x++){
			System.out.println("Value of X is :" + x);
			
			if (x==4)
				x++;
				//x += x;
				//x = x+1;
			System.out.println("End of If Value of X is :" + x);

			do{
				x--;
			} while (x!=0);
			System.out.println("End of While Value of X is :" + x);
		}		

	}
}

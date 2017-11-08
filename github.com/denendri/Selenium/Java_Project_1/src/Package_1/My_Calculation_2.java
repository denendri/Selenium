package Package_1;

public class My_Calculation_2 extends Calculation_2{
	public void multiplication(int x, int y){
		z = x * y;
		System.out.println("The product of the given numbers: " + z);
	}
	
	public static void main(String args[]){
		int a = 20, b=10;
		My_Calculation_2 demo = new My_Calculation_2();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
	}
}

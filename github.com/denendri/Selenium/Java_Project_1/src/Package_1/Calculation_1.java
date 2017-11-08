package Package_1;

public class Calculation_1 {
	public int sum(int a, int b){
		System.out.println("sum (int a, int b) invoked");
		return a+b;
	}
	public int sum(int a, int b, int c){
		System.out.println("sum (int a, int b, int c) invoked");
		return a+b+c;
	}
	public static void main(String[] args){
		Calculation_1 c1 = new Calculation_1();
		System.out.println("Sum of two numbers: "+c1.sum(10, 20));
		System.out.println("Sum of two numbers: "+c1.sum(20, 60, 40));
	}
}

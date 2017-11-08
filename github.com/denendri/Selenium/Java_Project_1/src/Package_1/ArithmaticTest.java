package Package_1;

public class ArithmaticTest {
	public void division(int num1, int num2) {
		//java.lang.ArithmeticException here 
                //and not caught hence propagate to method1.
		System.out.println(num1/num2);
	}
 
	public void method1(int num1, int num2) {
		//not caught here and hence propagate to method2.
		division(num1, num2);
	}
 
	public void method2(int num1, int num2){
		try{
			method1(num1, num2);
		}catch(Exception e){//caught exception here.
			System.out.println("Exception Handled");
		}
	}
}

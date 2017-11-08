package Package_1;

public class Decision_making_in_java {
	public static void main(String args[]){
		char grade = 'A';
		
		switch(grade){
			case 'A' :
				System.out.print("Pass");
					break;
			case 'F' :
				System.out.print("Fail");
					break;
			default :
				System.out.print("Invalid");
		}
	}
}

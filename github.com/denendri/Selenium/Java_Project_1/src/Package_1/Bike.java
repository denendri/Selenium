package Package_1;

public class Bike extends Vehicle {
	int speed = 100;
	void message(){
		System.out.println("Message of Bike");
	}
	void run(){
		super.run();
		System.out.println("Bike is running safely");
		
	}
	void display(){
		System.out.println("Speed is : "+speed);
		System.out.println("Speed of Vehicle : "+super.speed);
		message();
		super.message();
	}
	public Bike(){
		super();
		System.out.println("Bike is created");
	}
}

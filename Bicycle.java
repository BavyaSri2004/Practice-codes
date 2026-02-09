package trail;
//inheritance
public class Bicycle extends Vehicle{
	 int wheels=2;
	 int pedals=2;
	 public void go() {
		 System.out.println("The bicycle is going ");
	 }
	 //abstraction
	 public void one() {
		 System.out.println("Bicycle wee ");
	 }
	 //polymorphism override
	 public void people() {
		 System.out.println("bicycel has 2 members");
	 }
}

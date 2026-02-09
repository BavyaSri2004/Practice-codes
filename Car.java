package trail;
//object passing and inheritance and encapsulation
public class Car extends Vehicle{
    private int wheels=4;
    private int doors=4;
    //inheritance
    public void go() {
    	System.out.println("The car is going at "+speed);
    }
   // abstraction
    public void one() {
    	System.out.print("hello world abstraction");
    }
    //encapuslation
    public int getwheels() {
    	return wheels;
    }
    public int getdoors() {
    	return doors;
    }
    public void setwheels(int wheels) {
    	this.wheels=wheels;
    }
    public void setdoors(int doors) {
    	this.doors=doors;
    }
    //polymorphism
    public void people() {
    	System.out.println("The car has 4 members");
    }
    public void getvehi() {
    	super.people();
    }
}

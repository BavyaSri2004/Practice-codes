package trail;
//object passing and inheritance and polymorphism
public abstract class Vehicle {
    double speed=99;
    public void go() {
    	System.out.println("The vehicle is moving");
    }
    public void stop() {
    	System.out.println("The vehicle is stopped");
    }
    abstract void one();
    public void people() {
    	System.out.println("one member");
    }
}

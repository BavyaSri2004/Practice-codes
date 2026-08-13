import java.util.*;
class Vehicle{
 protected String modelbrand="ford";
 public void honk(){
   System.out.println("tuu,tuu");
 }
}
class Car extends Vehicle{
 String modelname="Mustang";
}
public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.honk();
    System.out.println(car.modelname+" "+car.modelbrand);
  }
}

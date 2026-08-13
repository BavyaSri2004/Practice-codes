import java.util.*;
//Single Inheritance A->B one parent one child
class Animal{
   void eat(){
      System.out.println("Eating");
    }
}
class Dog extends Animal{
   void bark(){
      System.out.println("Barking");
   }
}
class Single_Inheritance{
 public static void main(String[]args){
    Dog d = new Dog();
    d.eat();
    d.bark();
 }
}

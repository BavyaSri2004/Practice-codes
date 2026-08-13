import java.util.*;
//Hierarchical Inheritance 
//  A->B,C
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
class Puppy extends Animal{
    void play(){
      System.out.println("Playing");
     }
}
class Hierarchical_Inheritance {
 public static void main(String[]args){
    Puppy p = new Puppy();
    p.eat();
    p.play();
    Dog d = new Dog();
    d.bark();
    d.eat();
 }
}

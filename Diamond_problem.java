import java.util.*;
//Multiple Inheritance with Diamond_problem
//  A->(B,C)->D
class Animal{
   void eat(){
       System.out.println("Animal is Eating");
       }
}
class Cat extends Animal{
   void eat(){
      System.out.println("Cat is Eating");
    }
}
class Dog extends Animal{
    void eat(){
      System.out.println("Dog is Eating ");
    }
}
class Puppy extends Cat,Dog {
    void play(){
      System.out.println("Playing");
     }
}
class Diamond_problem {
 public static void main(String[]args){
    Puppy p = new Puppy();
    p.eat();
    p.play();
 }
}

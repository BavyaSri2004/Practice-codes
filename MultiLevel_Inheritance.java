import java.util.*;
//MultiLevel Inheritance A->B->C
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
class Puppy extends Dog{
    void play(){
      System.out.println("Playing");
     }
}
class MultiLevel_Inheritance{
 public static void main(String[]args){
    Puppy p = new Puppy();
    p.eat();
    p.bark();
    p.play();
 }
}

import java.util.*;
//Multiple_Inheritance with solved Diamond_problem
//  A->(B,C)->D
interface Animal{
   void eat();
}
interface Cat extends Animal{
   void eat();
}
interface Dog extends Animal{
    void eat();
}
class Puppy implements Cat,Dog {
    public void eat(){
      System.out.println("Eating");
    }
    void play(){
      System.out.println("Playing");
     }
}
class Multiple_Inheritance {
 public static void main(String[]args){
    Puppy p = new Puppy();
    p.eat();
    p.play();
 }
}

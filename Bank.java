import java.util.*;
class Bank{
   private int no;
   private String name;
   //constructor
   public Bank(int no,String name){
      this.no=no;
      this.name=name;
   }
   //getter
   public int getno(){
     return no;
   }
   public String getname(){
     return name;
   }
   //setter
   public void setno(int no){
    this . no = no;
   }
   public void setname(String name){
    this . name = name;
   }
}
public class Main {
  public static void main(String[] args) {
    Bank n1=new Bank(1,"Neha");
    Bank n2=new Bank(2,"John");
    System.out.println("Account 1 : "  + n1.getname());
    n2.setname("prithvi");
    System.out.println("Account 2 : "  +n2.getname());
  }
}

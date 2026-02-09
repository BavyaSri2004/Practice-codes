package trail;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 Animal animal;
	 System.out.println("--------------------------------------------");
	 System.out.println("Select a choice ");
	 System.out.println("1.Cat");
	 System.out.println("2.Dog");
	 System.out.println("3.Exit");
	 System.out.println("--------------------------------------------");
	 System.out.print("Enter your choice : ");
	 int choice=scanner.nextInt();
	 switch(choice) {
	   case 1:
		      animal=new Cat();
		      animal.speak();
		      break;
	   case 2:
			  animal=new Dog();
			  animal.speak();
			  break;
	   case 3:
		      scanner.close();
			  return;
	   default:
		      animal=new Animal();
		      animal.speak();
		      break;
	 }
	 scanner.close();
	}

}

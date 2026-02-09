package trial;
import java.util.*;
public class Student {
    String Name;
    int Rollno;
    int age;
    int Marks;
    String Behavior;
    String Student_Level;
	
	 void study() {
		     if(Student_Level.equalsIgnoreCase("High")||Student_Level.equalsIgnoreCase("Medium")) {
	             System.out.println("Good at Studying");
		     }else {
		         System.out.println("Need to improve");
		     }
		}
	 void write() {
		System.out.println("Writing");
	}
	 void Play() {
		ArrayList<String>Behave=new ArrayList<>();
		Behave.add("Quiet");
		Behave.add("Good");	
		Behave.add("Excellent");
		Behave.add("high");	
		Behave.add("calm");
		Behave.add("naughty");
		if(Behave.contains(Behavior)) {
		    System.out.println("Playing and Happy");
		}else {
			System.out.println("Playing and UnHappy");
		}
	}
	 void Result() {
		if(Marks>=90 && Marks<=100) {
			System.out.println("Grade A");
		}else if(Marks>=60 && Marks<=89) {
			System.out.println("Grade B");
		}else if(Marks>=20 && Marks<=59) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade D");
		}
	}
	
	public Student(String Name,int Rollno,int age,int Marks,String Behavior,String Student_Level) {
		this.Name=Name;
		this.Rollno=Rollno;
		this.age=age;
		this.Marks=Marks;
		this.Behavior=Behavior;
		this.Student_Level=Student_Level;
	}
	
	public static void main(String[]args) {
		Student Ananya=new Student("Ananya",1,18,95,"Quiet","Low");
		Student Rahul=new Student("Rahul",2,18,75,"Naughty","Medium");
		Student Sneha=new Student("Sneha",3,17,98,"calm","high");
	    Ananya.study();
	    Rahul.Result();
	    Sneha.Play();
	    System.out.println(Ananya.Name);
	}
 }


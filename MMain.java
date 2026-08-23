package package1;
import java.util.*;

public class MMain {
  public static void main(String[]args) {
	  Employee [] emp =new Employee[4];
	  emp[0]=new Employee("John",34000,1,'a');
	  emp[1]=new Employee("keerths",1200000,2,'c');
	  emp[2]=new Employee("deepika",44444,3,'f');
	  emp[3]=new Employee("kavya",34567,5,'e');
      ArrayList<Employee>al=Employee.OrderBand(emp);
    	 // for(int i=0;i<4;i++) {
		 // System.out.println(emp[i].toString());
	     // }
      System.out.println("+-------------------------------------------+");
      System.out.printf("| %-10s | %-10s | %-8s | %-4s |\n","Name","Experience","Salary","Band");
      System.out.println("+-------------------------------------------+");
	  for(int i=0;i<al.size();i++) {
		  System.out.printf("| %-10s | %-10d | %-8d | %-4c |\n", al.get(i).getname(),al.get(i).getexperience(),al.get(i).getsalary(),al.get(i).getband());
	  }
	  System.out.println("+-------------------------------------------+");
	  System.out.println();
	  System.out.println("The highest salary of the month goes to "+ Employee.HighSalaryEmp(emp));
  }
}

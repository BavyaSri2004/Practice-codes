package package1;

import java.util.ArrayList;
import java.util.Arrays;

class Employee{
	//creating variables 
	private String name;
	private int salary;
	private int experience;
	private char band;
	
	//constructor 
	Employee(String name,int salary,int experience,char band){
		this.name=name;
		this.salary=salary;
		this.experience=experience;
		this.band=band;
	}
	//getter 
	public String getname() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	public int getexperience() {
		return experience;
	}
	public char getband() {
		return band;
	}
	//setter
    public void setname(String name) {
    	this . name = name ;
    }
    public void setsalary (int salary) {
    	this . salary = salary ;
    }
    public void setexperience (int experience) {
    	this . experience = experience ;
    }
    public void setband (char band) {
    	this . band = band ;
    }
    //toString
    public String toString() {
    	return name+"|"+salary+"|"+experience+"|"+band;
    }
    public static String HighSalaryEmp(Employee[]emp) {
    	int max_salary=emp[0].getsalary(),index=0;
    	for(int i=0;i<emp.length;i++) {
    		if(max_salary<emp[i].getsalary()) {
    			max_salary=emp[i].getsalary();
    			index=i;
    		}
    	}
    	return emp[index].getname();
    }
	public static ArrayList<Employee> OrderSalary(Employee[] emp) {
		Arrays.sort(emp,(e1,e2)->Integer.compare(e1.getsalary(), e2.getsalary()));
		ArrayList<Employee>order_salary=new ArrayList<>();
		for(int i=0;i<emp.length;i++) {
		order_salary.add(emp[i]);
		}
		return order_salary;
	}
	public static ArrayList<Employee> OrderExperience(Employee[]emp){
		Arrays.sort(emp,(e1,e2)->Integer.compare(e1.getexperience(),e2.getexperience()));
		ArrayList<Employee>order_exp=new ArrayList<>();
		for(int i=0;i<emp.length;i++) {
			order_exp.add(emp[i]);
		}
		return order_exp;
	}
	public static ArrayList<Employee> OrderName(Employee[]emp){
		ArrayList<Employee>order_name =new ArrayList <>();
		Arrays.sort(emp,(e1,e2)->e1.getname().compareToIgnoreCase(e2.getname()));
		for(int i=0;i<emp.length;i++) {
			order_name.add(emp[i]);
		}
		return order_name;
	}
	public static	ArrayList<Employee> OrderBand(Employee[]emp){
		Arrays.sort(emp,(e1,e2)->Character.compare(e1.getband(),e2.getband()));
		ArrayList<Employee>order_band =new ArrayList<>(Arrays.asList(emp));
		return order_band;
	}
}
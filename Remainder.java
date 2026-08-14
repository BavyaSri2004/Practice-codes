package package1;

import java.util.Scanner;

class Remainder{
	public static void main(String[]args) {
		    try { 
		    Scanner sc= new Scanner(System.in);
		    System.out.print("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.print("Enter num2 : ");
			int num2=sc.nextInt();
			int Quotient=-1,Remainder=-1;
			if(num1>num2) {
				Quotient=num1/num2;
				Remainder=num1%num2;
			}
			System.out.println(Quotient);
			System.out.println(Remainder);
			sc.close();
		    }catch(ArithmeticException e){
		     e.printStackTrace();
		    }
	}
}

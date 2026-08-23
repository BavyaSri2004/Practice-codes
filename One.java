package package1;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;
		char[] ans=new char[3];
		char[]orians= {'a','b','b'};
		char ch='y';
		do {
		System.out.println("Quiz game");
		System.out.println("Who is the father of nation?");
		System.out.println("a.Gandhi b.Nehru c.Nethaji");
		ans[0]=sc.nextLine().charAt(0);
		System.out.println("What is the color of lotus?");
		System.out.println("a.red b.pink c.yellow");
		ans[1]=sc.nextLine().charAt(0);
		System.out.println("Who is the cm of tamil?");
		System.out.println("a.Gandhi b.vijay c.Ajith");
		ans[2]=sc.nextLine().charAt(0);
		for(int i=0;i<3;i++) {
			if(orians[i]==ans[i])score++;
		}
       System.out.println("Score : "+score+"/3");
       System.out.println("Wanna play again ? y/n ");
       ch=sc.nextLine().charAt(0);
       score=0;
		}while(ch=='y');
		System.out.println("Thanks for playing ");
	}

}

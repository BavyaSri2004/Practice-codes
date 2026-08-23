package package1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		//QUIZ GAME
		Scanner scanner=new Scanner(System.in);
		int score=0,choice;
		String[]questions= {
				"1.)What is the day today ? ",
				"2.)How are you ? ",
				"3.)Will you be my Valentine ? ",
				"4.)Are you sure ? "
		};
      String[][]options= {
    		  {"1.Sun ","2.Mon ","3.Tues ","4.Wed ","5.Thurs ","6.Fri ","7.Sat ","8.Sun "},
    		  {"1.Fine ","2.Not Fine ","3.Sad "},
    		  {"1.Yes ","2.No "},
    		  {"1.Yes ","2.No"}
      };
      int[]ans= {4,1,1,1};
      System.out.println("***************");
      System.out.println("QUIZ GAME");
      System.out.println("***************");
      for(int i=0;i<questions.length;i++) {
    	  System.out.println(questions[i]);
    	  for(String option:options[i]) {
    		  System.out.print(option);
    	  }
    	  System.out.println();
    	  System.out.print("Enter your choice : ");
    	  choice=scanner.nextInt();
    	  if(choice==ans[i]) {
    		  System.out.println("****************");
    		  System.out.println("****CORRECT*****");
    		  System.out.println("****************");
    		  score++;;
    	  }else {
    		  System.out.println("****************");
    		  System.out.println("****WRONG!!*****");
    		  System.out.println("****************");
    	  }
    	}
      System.out.println("You got "+score+" out of "+questions.length);
      scanner.close();
	}
}

package package1;
import java.util.*;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		String playagain="yes";
		int bestofthree=0;
		int score=0,tie=0;
		String[]choice= {"rock","paper","scissor"};
		String computerchoice;
	    System.out.println("ROCK / PAPER / SCISSOR GAME");
	do {
		while(bestofthree!=3) {
	   	    System.out.print("Enter your choice [rock,paper,scissor] :  ");
		    String playerchoice=scanner.nextLine().toLowerCase();
		    computerchoice=choice[random.nextInt(3)];
		    System.out.println("playerchoice : "+playerchoice);
		    System.out.println("computerchoice : "+computerchoice);
		   if(!playerchoice.equals("rock")&&!playerchoice.equals("paper")&&!playerchoice.equals("scissor")) {
			System.out.println("Invalid choice bro");
			continue;}
		  else if(playerchoice.equals(computerchoice)) {
			System.out.println("Its a tie !!"); 
			tie++;
		  }
		  else if((playerchoice.equals("rock")    && computerchoice.equals("scissor"))  ||
				(playerchoice.equals("paper")     && computerchoice.equals("rock"))     ||
				(playerchoice.equals("scissor")   && computerchoice.equals("paper"))) {
			score++;
			System.out.println("Smart move ");
		  }else {
			  System.out.println("focus");
		  }
		System.out.println("Your score "+ score);
		bestofthree++;
		}
		if((score==2||score==3)||(score==1 && ((tie==1)||(tie==2)) )) System.out.println("You win !!!"); 
		else if(tie==3)System.out.println("Draw the game");
		else System.out.println("You lose"); 
		System.out.println("Do you want to play again (yes/no) ");
		playagain=scanner.nextLine().toLowerCase();
    }while(playagain.equals("yes"));
     scanner.close();
	}
}

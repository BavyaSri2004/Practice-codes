package trail;
import java.util.Random;
//variable scope
public class Diceroller {
	Random random;
	int number=0;
	public Diceroller() {
	  random=new Random();
	  roll();	
	}
	public void roll() {	
		number=random.nextInt(6)+1;
		System.out.println(number);
	}

}

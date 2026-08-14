package package1;
import java.util.Scanner;
//Enum is short for enumeration
public class Enum {
    enum Level {
    	LOW,
    	MEDIUM,
    	HIGH
    }
    enum Difficulty{
    	EASY,
    	MEDIUM,
    	HARD
    }
    enum Days{
    	MONDAY,
    	TUESDAY,
    	WEDNESDAY,
    	THURSDAY,
    	FRIDAY,
    	SATURDAY,
    	SUNDAY
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Level myvar = Level.LOW;
		switch (myvar) {
		case LOW:
			System.out.println("Low");
			break;
		case MEDIUM:
			System.out.println("Medium");
			break;
		case HIGH:
			System.out.println("High");
			break;
		default :
			System.out.println("Enter any");
		}
		//Without Enum usage
		System.out.println("Enter a number (1-7) : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
            break;
		default :
			System.out.println("Enter any");
		}
		//with Enum usage
		System.out.println("Enter a number (1-7) : ");
		int val = sc.nextInt();
		switch(val) {
		case 1:
			System.out.println(Days.MONDAY);
			break;
		case 2:
			System.out.println(Days.TUESDAY);
			break;
		case 3:
			System.out.println(Days.WEDNESDAY);
			break;
		case 4:
			System.out.println(Days.THURSDAY);
			break;
		case 5:
			System.out.println(Days.FRIDAY);
			break;
		case 6:
			System.out.println(Days.SATURDAY);
			break;
		case 7 :
			System.out.println(Days.SUNDAY);
            break;
		default :
			System.out.println("Enter any");
		}
		

		sc.close();
	}

}

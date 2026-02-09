package trail;

public class Friends {
    String name;
    static int num_friends;
	public Friends(String name) {
		this.name=name;
		num_friends++;
	}
    static void display() {
    	System.out.println("You have "+num_friends);
    	
    }
}

package trail;

public class Fish implements Prey,Predator{
    public void flee() {
    	System.out.println("Big fish eat this");
    }
	public void hunt() {
		System.out.println("this hunts Small fish");
	}

}

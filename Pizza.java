package trail;
//overloaded constructor
public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String toppings;
	public Pizza(String bread,String sauce,String cheese,String toppings) {
		this.bread=bread;
		this.sauce=sauce;
		this.cheese=cheese;
		this.toppings=toppings;
	}
	public Pizza(String bread,String sauce,String cheese) {
		this.bread=bread;
		this.sauce=sauce;
		this.cheese=cheese;
	}
	public Pizza(String bread,String sauce) {
		this.bread=bread;
		this.sauce=sauce;
	}
	public Pizza(String bread) {
		this.bread=bread;
	}
	public Pizza() {
	}
    public String toString() {
    	return bread+"-"+sauce+"-"+cheese+"-"+toppings;
    }

}

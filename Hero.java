package trail;

public class Hero extends Person{
	String superpower;
	public Hero(String name,int age,String superpower) {
		this.superpower=superpower;
		super(name,age);
	}
	public String toString() {
    	return super.toString()+"\n"+superpower;
    }
}

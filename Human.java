package trail;
//constructor
public class Human {
	String name;
	int age;
	String gender;
	public Human(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void eat() {
		System.out.println("I am  eating "+this.name);
	}
	public void drink() {
		System.out.println("I am drinking "+this.name);
	}
	// usage : object is created values are also provided in single line
}

package package1;
import java.util.*;

class Produc{
	private int id;
	private String name;
	private int price;
	private String category;
	
	Produc(int id,String name,int price,String category){
		this.id=id;
		this.name=name;
		this.price=price;
		this.category=category;
	}
}

public class Product {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  int id,price,ans=0;
	  HashMap<String,Integer>mp=new HashMap<>();
	  String name,category;
	  int no=sc.nextInt();
	  for(int i=0;i<no;i++) {
		  id=sc.nextInt();
		  sc.next();
		  name = sc.nextLine();
		  price=sc.nextInt();
		  category=sc.nextLine();
		  Produc p=new Produc(id,name,price,category);
		  mp.put(category,price);
	  }
	  String input=sc.nextLine();
	  for(String key:mp.keySet()) {
		  if(key.equals(input)) {
			  ans+=mp.get(key);
		  }
	  }
	  System.out.println(ans/2+" ");
	  sc.close();
  }
}

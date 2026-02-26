package package1;
import java.util.*;
public class Streamex{
	public static void main(String[]args) {
		List<String>names=Arrays.asList("Arya","Geetha","Neha","Bhavatharini","Nisha","Deepika","Aarthi","Aarav");
		long res=names.stream()
                       .filter(s->s.startsWith("A"))
                       .count();
		List<String>ans=names.stream()
				             .filter(s->s.startsWith("N"))
				             .toList();
		System.out.println("Count with names starting A  : "+ res);
		System.out.println("List with starting name as N : "+ ans);
	}
}
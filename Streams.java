package package1;
import java.util.*;
import java.util.stream.*;
public class Streams {
	public static void main(String[] args) {
		List<String>name=Arrays.asList("EVe","Adam","Madam");
		name.stream().forEach(System.out::print);
		System.out.println();
		
		int[]arr= {1,2,3,5,6};
		IntStream str=Arrays.stream(arr);
		str.forEach(System.out::print);
		System.out.println();
		
		Stream<String>fruits= Stream.of("apple","mango","strawberry");
		fruits.forEach(System.out::println);
		
		Stream<String>hello=Stream.generate(()->"hello").limit(4);
		hello.forEach(System.out::println);
	}
}

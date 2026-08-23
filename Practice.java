package package1;
import java.util.*;
import java.util.stream.Collectors;
class Practice {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
	}
	static void streams(List<Integer> list, List<String> courses) {
		list.stream().forEach(Practice::print);
		list.stream().forEach(System.out::println);
		list.stream().filter(Practice::isEven).forEach(Practice::print);
		list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
		list.stream().map(x -> x * 2).forEach(System.out::println);
		list.stream().map(x -> x * 2).filter(x -> x > 2).forEach(System.out::println);
		// sum values
		int value = list.stream().reduce(0, Practice::sum);
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		int val = list.stream().reduce(0, (x, y) -> y + x);
		int ans = list.stream().reduce(0, Integer::sum);
		int Val = list.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
		System.out.println(value);
		System.out.print(sum);
		System.out.println(val);
		System.out.println(ans);
		System.out.println(Val);
		list.stream().map(Practice::square).forEach(System.out::println);
		list.stream().map(x -> x * x).forEach(System.out::println);
		// Exercise
        //Print Only Odd Numbers from the List
		list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
		// Print All Courses individually
		courses.stream().forEach(System.out::println);
		// Print Courses Containing the word "Spring"
		courses.stream().filter(x -> x.contains("Spring")).forEach(System.out::println);
		// Print Courses Whose Name has atleast 4 letters
		courses.stream().filter(x -> x.length() >= 4).forEach(System.out::println);
		// Print the cubes of odd numbers
		list.stream().filter(x -> x % 2 != 0).map(x -> x * x * x).forEach(Practice::print);
        //Print the number of characters in each course name
		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
		// Square every number in a list and find the sum of squares
		int sum_sq = list.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
		System.out.println(sum_sq);
		// Cube every number in a list and find the sum of cubes
		int sum_cube = list.stream().map(x -> x * x * x).reduce(0, (x, y) -> x + y);
		System.out.println(sum_cube);
		// Find Sum of Odd Numbers in a list
		int sum_odd = list.stream().filter(x -> x % 2 != 0).reduce(0, (x, y) -> x + y);
		System.out.println(sum_odd);
		// Create a List with Even Numbers Filtered from the Numbers List
		List<Integer> list_even = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	}
	static void print(int number) {
		System.out.println(number);
	}

	static Boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		return false;
	}

	static int sum(int x, int y) {
		// System.out.println(x+" "+y+" "+"x+y = "+(x+y));
		return x + y;
	}

	static int square(int x) {
		System.out.println("x = " + x + " | " + "x*x = " + x * x);
		return x * x;
	}
}
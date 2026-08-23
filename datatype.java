package package1;

public class datatype {
    static int static_int=4;
	public static void main(String[] args) {
		int int_value=5;
		final int final_int_value=3;
		Integer integer_value=6;
		int autobox_Integer_to_int=integer_value;
		Integer autobox_int_to_Integer=int_value;
		Integer Str_to_Integer=Integer.parseInt("33");
		int Str_to_Integer_to_int=Str_to_Integer;
		System.out.println(static_int);
		System.out.println(int_value);
		System.out.println(final_int_value);
		System.out.println(integer_value);
		System.out.println(autobox_Integer_to_int);
		System.out.println(autobox_int_to_Integer);
		System.out.println(Str_to_Integer);
		System.out.println(Str_to_Integer_to_int);






	}

}

package package2;
import trail.*;
public class C {
	protected String protectmsg="This msg is protected";
    String str="hello msg";
    private String privatemsg="This msg is in private";
    public String publicmsg="This msg is in protected";
    public String getmsg() {
    	return privatemsg;
    }
    public String toString() {
    	return str;
    }
    public static void  main(String[]args) {
    	 B b=new B();
    	System.out.println(b.str);
    }
    
}

package package1;
class Practice{
	public static void main(String[]args) {
		    try { 
			int x=2/0; 
			System.out.println(x); 
		    }catch(Exception e) 
		     {
		    System.out.println("There is something wrong"); 
		     }
		int y=2/0;
		System.out.println(y);
	}
}

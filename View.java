package trial;
class View{
	public static void main(String[]args) {
		String str="Bro  ";
		char ch=str.charAt(0);//B
		int index=str.indexOf('o');//2
		int length=str.length();//5
		boolean bool=str.isEmpty();//false
		boolean bool1=str.isBlank();//false;
		String str_U=str.toUpperCase();//BRO
		String str_L=str.toLowerCase();//bro
		String trim=str.trim();//Bro
		String replaced=str.replace('r', 'a');//Bao
		boolean r1=str.equals("Bro  ");//true
		boolean r2=str.equals("bro");//false
		boolean r3=str.equalsIgnoreCase("bro  ");//true
		System.out.println("Char is "+ch);
		System.out.println("index is "+index);
		System.out.println("length is "+length);
		System.out.println("boolean is "+bool);
		System.out.println("boolean is "+bool1);
		System.out.println("UpperString is "+str_U);
		System.out.println("lowerString is "+str_L);
		System.out.println("trim is "+trim);
		System.out.println("replaced is "+replaced);
		System.out.println("Bro is equal to Bro "+r1);//true
		System.out.println("Bro is equal to bro "+r2);//false
		System.out.println("Bro is ignore case senstive equal to bro "+r3);//true


	}
}
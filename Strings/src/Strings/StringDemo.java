package Strings;

public class StringDemo {

	public static void main(String[] args) 
	{
	String s = "java";
	
	String s4 = "java";
	String s5 = "java";
	
	
	String s6 = "coach";
	String s7 = "coaches";
	
	String s8 = "coach";
	String s9 = "coac";
	
	String s11 = "coaching";
	String s12 = "coaching";
	
	
	char ch[]={'j','a','v','a'};
	String s1 = new String(ch);
	String s2 = new String("rama");
	
	String s10 = "coach"+"coac";// concat   + operaotr
	System.out.println(s11.equals(s12));
	
	
	System.out.println(s10);
	System.out.println(s8.compareTo(s9));//s8>s9 returns +ve value
	System.out.println(s6.compareTo(s7));//  s6<s7  returns -ve value
	System.out.println(s.equals(s4));// content comparison
	System.out.println(s.equalsIgnoreCase(s4));
	System.out.println(s==s5);
	System.out.println(s==s2);
		System.out.println(s.concat("pgm"));//it will print only java b'z strings are immutable
		System.out.println(s=s.concat("pgm"));//explicitly assign to the reference variable
		System.out.println(s2);
		System.out.println(s2.concat("devi"));// concat append the string at the end here new object is created
		

	}

}

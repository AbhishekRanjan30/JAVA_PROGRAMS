import java.util.*;
import java.io.*;

class Anagram{
	static boolean check_Anagram(String s1,String s2){
		
		if(s1.length() != s2.length())
			return false;

		char a1[]=s1.toCharArray();
		Arrays.sort(a1);
		s1=new String(a1);

		char a2[]=s2.toCharArray();
		Arrays.sort(a2);
		s2=new String(a2);

		return s1.equals(s2);
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		String s2=new String();

		System.out.println("Enter the String");
		s1=sc.next();

		System.out.println("Enter String to Check for Anagram...");
		s2=sc.next();

		System.out.println(check_Anagram(s1,s2));
	}
}

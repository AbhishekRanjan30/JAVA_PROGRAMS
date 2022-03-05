import java.io.*;
import java.util.*;

class Palindrome{

	static boolean Check(String str,int start,int end){

	if(start>=end){
		return true;
	}

	return ((str.charAt(start) == str.charAt(end)) && Check(str,start+1,end-1));
		
	} 
		
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		String str;
			
		System.out.println("Enter the String to Check .......");
		str=sc.nextLine();

		
		// System.out.println(n);

		boolean res=Check(str,0,str.length()-1);
		
		if(res==true){
			System.out.println("This String is Palindrome......");
		}
		
		else {
			System.out.println("This String is not Palindrome .....");
		}
	}
}

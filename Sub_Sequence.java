import java.io.*;
import java.util.*;
class Sub_sequence{

		static boolean check_Subsequence(String s1,String s2,int n,int m){
		if(m==0){
			return true;
		}
		if(n==0){
			return false;
		}
	
		if(s1.charAt(n-1) == s2.charAt(m-1)){
			 return check_Subsequence(s1,s2,n-1,m-1);
		}	
		else{
			return check_Subsequence(s1,s2,n-1,m);
		}
}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		String s2=new String();
		boolean res;
		System.out.println("Enter the String");
		s1=sc.next();
		System.out.println("Enter Sub_String to Check....");
		s2=sc.next();
		int n=s1.length();
		int m=s2.length();
		res=check_Subsequence(s1,s2,n,m);
		if(res==true){
			System.out.println("Sub_Sequence Found....");
		}
		else{
			System.out.println("Sub_Sequence not Found....");
		}
	}
}

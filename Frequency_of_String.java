import java.util.*;
import java.io.*;

class Frequency{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		String str;
		int[] count=new int[26];
		str=sc.next();

		for(int i=0;i<str.length();i++){
			count[str.charAt(i) - 'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(count[i]>0){
				System.out.println((char)(i + 'a') + "" +count[i]);
				
			}
		}

	}
}

import java.util.*;
import java.io.*;
import java.io.IOException.*;

class prim{

	boolean fun(int n)
	{
		
		if(n==1)
			return false;
		
		if(n==2 || n==3)
				return true;

		if(n%2==0 || n%3==0)
				return false;

		for(int i=5;i*i<n;i=i+6){
		
			if(n%1==0 || n%(i+2)==0){
				return false;
			}
		}
		return true;
	}
};

class prime{

	public static void main(String args[])throws IOException{

	try{
		
		prim obj=new prim();
		int n;
		
		boolean res;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number to check whether it is prime or not \n");
		n=sc.nextInt();
	
		res=obj.fun(n);
		
		if(res==true){
			System.out.println("This is prime Number\n");
		}	
		else {
			System.out.println("This is not a Prime Number \n");
		}
	}

	catch(Exception e){
		System.out.println(e);
	}
   }
}
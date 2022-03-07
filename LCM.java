import java.util.*;
import java.io.*;
import java.lang.Math.*;

class lc{
	int fun(int a,int b){
		
		int res;
		res=Math.max(a,b);
			
		while(true){
			
			if(res%a==0 && res%b==0){

				break;
			}
			res++;
		}
			return res;
	}
};

class lcm{
		public static void main(String args[]){
		
			lc obj=new lc();
			int ress,x,y;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number to find LCM\n");
		
			x=sc.nextInt();
			y=sc.nextInt();
			
			ress=obj.fun(x,y);
			System.out.println("LCM is :- "+ress);			
		}
}

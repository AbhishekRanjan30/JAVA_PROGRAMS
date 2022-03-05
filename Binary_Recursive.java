import java.util.*;
import java.io.*;

class BinaryRecursive{
	static int fun(ArrayList<Integer> arr,int n,int low,int high,int ele){
		
		int mid,res=false;
		while(low>high){
			mid=(high+low)/2;

			if(arr.get(mid)==ele){
				res=true;
				return mid;
	
			}

			else if(arr.get(mid)<ele){
				return fun(arr,n,mid+1,high,ele);
			}

			else if(arr.get(mid)>ele){
				return fun(arr,n,low,mid-1,ele);
			}
		}
		if(!res){
			System.out.println("Element is not found..\n");
		}

	}

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n,low=0,ele,res;
		n=sc.nextInt();
		int high=n-1;
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
	
		for(i=0;i<n;i++){
			arr.get(sc.nextInt());
		}

		System.out.println("Enter the Element to be Search......\n");
		ele=sc.nextInt();
	
		
		res=fun(arr,n,low,high,ele);
		System.out.println("Element is found at Positon :- "+(res+1));
	}
}

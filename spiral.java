import java.io.*;
import java.util.*;
import java.io.IOException.*;
class spi{
	
	void fun(int x,int y,int arr[][]){
		
		int k=0,m=x,l=0,n=y,i;
		while(k<m && l<n){
			
			for(i=l;i<n;++i){
				System.out.println(arr[k][i]);
			}
			k++;
			
			for(i=k;i<m;++i){
				System.out.println(arr[i][n-1]);
			}
			n--;

			if(k<m){
	
				for(i=n-1;i>=l;i--){
					System.out.println(arr[m-1][i]);
				}
				m--;
			}

			if(l<n){
				
				for(i=m-1;i>=k;i--){
					System.out.println(arr[i][l]);
				}
				l++;
			}
		}
	}

};

class spiral{

	public static void main(String args[])throws IOException{

	try{

		spi obj=new spi();

		int m,n,i,k;
		int[][] arr=new int[10][10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Size of the 2D array \n");

		m=sc.nextInt();
		n=sc.nextInt();

		System.out.println("Enter the Elements in the 2d Array \n");

		for(i=0;i<m;i++){

			for(k=0;k<n;k++){
								
				arr[i][k]=sc.nextInt();
			}
			System.out.println();
		}

		obj.fun(m,n,arr);
	
     }

    catch(Exception e){
		System.out.println(e);
	}	
	}
}
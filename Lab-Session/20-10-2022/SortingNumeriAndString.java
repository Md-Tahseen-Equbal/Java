/*
 @author-Md Tahseen Equbal
 Program-WAP to Sort Numeric data of the given array.
 Date-20-10-2022
 */
package Lab;

import java.util.Scanner;

public class SortingNumeriAndString {

	public static void main(String[] args) {
		 int Max = 0;
	       int prevMax=0;
		   Scanner sc=new Scanner(System.in);
		   int a[]=new int[5];
		   
		   
		   System.out.println(" Input for array");
		   for(int i=0;i<5;i++){// for loop starting for indexing from 0 to 4
		     a[i]=sc.nextInt();// taking input and assign it to array  
		  
		   }
		   for(int i=0;i<5;i++) {  // for loop starting for indexing from 0 to 4
		       int min=1000,k=i,temp=0;
			  for(int j=i;j<5;j++){ //Find minimum Value
				  if(min>a[j]){
					  min=a[j];
					  k=j;
				  }
			  } 
//			swapping  a[0],min
			  temp=a[k];
			  a[k]=a[i];
			  a[i]=temp;
			   
		   }
		   System.out.println("Sort Numeric Array");
		   
		for(int i:a){
			System.out.print(i+" ");
		}
		
	}

}

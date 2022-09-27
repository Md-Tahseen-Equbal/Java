package Corejava;

import java.util.Scanner;

public class RelationalT {

	public static void main(String[] args) {
		
		// creating the scanner class to take input 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		
		//getting input from system
		
		int x=sc.nextInt();
		System.out.println("Enter Second  Number");
		int y=sc.nextInt();
		
		//getting input from system
		
		System.out.println("Enter Third  Number");
		
		//getting input from system
		
		int z=sc.nextInt();
		
		//performing equal to operator
		
		System.out.println("num1==num2==num3 :"+(x==y &&y==z));
		
		//performing is  not equal to operator
		
		System.out.println("num1!=num2  and num!=z :"+(x!=y && y!=z));
		
		//performing greater than operator
		
		System.out.println("num1>num2 and num2>num3 :"+(x>y && y>z ));
		
		//performing less than operator 
		
		System.out.println("num1<num2  and num2<num3 :"+(x<y && y<z));
		
		//performing greater than or equal  operator 
		
		System.out.println("num1>=num2 and  num2>=num3 :"+(x>=y && y>=z));
		
		//performing Less than or equal operator 
		
		System.out.println("num1<=num2 and num2<=num3 :"+(x<=y && y<=z));
		 

	}

}

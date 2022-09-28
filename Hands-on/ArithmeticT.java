package Corejava;

import java.util.Scanner;

public class ArithmeticT {

	public static void main(String[] args) {
		
		//Creating Scanner object to take input from user 
		
		Scanner sc= new Scanner(System.in);
		
		//getting input from user.
		
		System.out.println("Enter value for first Element");	
		int a=sc.nextInt();
		
		System.out.println("Enter value for second Element");
		int b=sc.nextInt();
		
		System.out.println("Enter value for Third Element");
		int c=sc.nextInt();
		
		//Writting Operations.
		
		int sum= a+b+c;
		System.out.println("The sum is : "+sum);
		int sub= (a-b)-c;
		System.out.println("The sub is : "+sub);
		int mul= a*b*c;
		System.out.println("The Product is : "+mul);
		int div= (a/b)/c;
		System.out.println("The Divide is : "+div);
		int mod= a%b%c;
		System.out.println("The Modolus is : "+mod);
	}

}

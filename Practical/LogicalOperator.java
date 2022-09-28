package Corejava;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		//Creating Scanner Object to taking input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
		System.out.println("Enter Third number :");
		int num3 = sc.nextInt();
		
		//Logical OR to verify two constraints.
		System.out.println("Performing OR Operation");
		if((num1<num2)||(num2==num3)) 
		{
		 int Sum =num1+num2+num3;
		 System.out.println("The Sum is : "+Sum);
		}
		else
		{
			System.out.println("False Condition");
		}
		
		//Logical AND to verify two constraints.
		
		System.out.println("Performing AND Operation");
		if((num1<num2)&&(num2==num3)) 
		{
		 int Sum =num1+num2+num3;
		 System.out.println("The Sum is : "+Sum);
		}
		else
		{
			System.out.println("False Condition");
		}
		
		//Logical NOT to verify two constraints.
		
		System.out.println("Performing NOT Operation");
		
		System.out.println("!(num1<num2) = "+!(num1<num2));
		System.out.println("!(num2>num3) = "+!(num2>num3));
	
		

	}

}

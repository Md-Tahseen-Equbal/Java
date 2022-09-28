package Corejava;
import java.util.Scanner;
class AssingmentOperator {

	public static void main(String[] args) {
		//Creating Scanner Object to taking input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
		
		//Adding and Assining value.
		
		num1 += num2;
		System.out.println("num1 = "+num1);
		
		//Subtracting and Assining value.
		
		num2 -= num1;
		System.out.println("num2 = "+num2);
		
		//Multiplying and Asssining value.
		
		num2*=num1;
		System.out.println("num2 = "+num2);
		
		//Dividing and Assining value.
		
		num2/=num1;
		System.out.println("num2 = "+num2);
		
		//Modulus and Assining value.
		
		num2%=num1;
		System.out.println("num2 = "+num2);
		

	}

}

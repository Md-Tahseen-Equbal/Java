package Corejava;
import java.util.Scanner;
class UninaryOperator {

	public static void main(String[] args) {
		//Creating Scanner Object to taking input from user
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the First value :");
				int num1 = sc.nextInt();
				
				//Performing Uninary Operation.
				
				num1 =-num1;
				System.out.println("Result is : " +num1);

				//Performing pre Increment
				
				++num1;
				System.out.println("Pre increment : "+num1);
				
				--num1;
				System.out.println("Pe decrement : "+num1);
				
				num1++;
				System.out.println("Post increment : "+num1);
				
				num1--;
				System.out.println("Post decrement :"+num1);
		
	}

}

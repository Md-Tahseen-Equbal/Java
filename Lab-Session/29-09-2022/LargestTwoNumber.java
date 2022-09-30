//Ques2. Create a program to find largest of two numbers.

package Lab;
import java.util.Scanner;

public class LargestTwoNumber {

	public static void main(String[] args) {
		
		//Creating Scanner Object to taking input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		
		//Using Conditional Statement for finding Largest Number in Given User Input. 
		
		if(a>b)
			System.out.println("Largest = "+a);
		else
			
		System.out.println("Largest = "+b);;

	}

}

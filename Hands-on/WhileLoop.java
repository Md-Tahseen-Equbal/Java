
//Q2-WAP to demonstrate while loop continues until entered number is positive.Take the input from the user


package Corejava;
import java.util.Scanner;
public class WhileLoop {

	public WhileLoop() {
		
	}
	public static void main(String...d) {
		
		// Create a Scanner object for keyboard input.
		
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter Number");
			   
			    //Getting Input Using While Loop
			    
			    int x=sc.nextInt();
			    while(x>=0){
			    	System.out.println("Number is positive :"+ x);
			    	x=sc.nextInt();
			    }
			   
	 }
}


//Ques3:Create a program for calculation.read three values from the user for operation
//first and second values as operands.
//third value as operator.
//if user press1 => print addition of first and second
//if user press2 => print subtraction of first and second
//if user press3 => print multiplication of first and second
//if user press4 => print division of first and second

package Lab;
import java.util.Scanner;
class Calculator 
{
    public static void main(String [] tahseen)
    {
    	//Creating Scanner object to take input from user 
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Inputs : ");
        int input1=sc.nextInt();
        System.out.println("Please Enter Second Inputs : ");
        int input2=sc.nextInt();
        System.out.println("Please Enter \n1 For Additional, \n2 For Subtraction, \n3 For Multiplication, \n4 For Division\n ");
        int switchinput=sc.nextInt();
        switch(switchinput)
        // Using Switch Operation For Calculation Operation.
        {
            case 1:
            	//Performing Addition
            System.out.println("The Addition Is :"+(input1+input2));
            break;
            case 2:
            	//Performing Subtraction.
            System.out.println("The Subtraction Is :"+(input1-input2));
            break;
            case 3:
            	//Performing Multiplication.
            System.out.println("The Multiplication Is :"+(input1*input2));
            break;
            case 4:
            	//Performing Division.
            System.out.println("The DivisionIs :"+(input1/input2));
            break;
            default:
            System.out.println("Wrong Input");     
        }
        
    }
}
	

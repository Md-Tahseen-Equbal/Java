
//Q-3 WAP to check the condition for checking the correct password using If-Else.Take input from the user.

package Lab;
import java.util.Scanner;

class CorrectPassword {

    public static void main(String[] args) {
        System.out.println("Enter your Password");
        
        //Creating Scanner For Taking user Input.
        
        Scanner s = new Scanner(System.in);
        int pass = s.nextInt();
        
        // Using If Else For Checking Valid Password

        if (pass == 23456) {
            System.out.println("Valid Password");
         
        }
        else

        System.out.println("Invalid Password ");
    }
}

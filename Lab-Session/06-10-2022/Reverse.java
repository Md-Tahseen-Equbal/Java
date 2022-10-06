

// Q2- WAP to find reverse of a number

package Lab;

import java.util.Scanner;
class Reverse
{
  public static void main(String args[])
  {
    int n, reverse = 0;
    
    //Creating Scanner for Taking user input

    System.out.println("Put an Number to Reverse");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    
    //Using While Loop For Reverse User Input Number 

    while(n != 0)
    {
      reverse = reverse * 10;
      reverse = reverse + n%10;
      n = n/10;
    }

    System.out.println("Reverse  number is " + reverse);
  }
}
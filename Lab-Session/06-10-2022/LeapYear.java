
// Q1 - WAP to Check for Leap Year.Take the input from the user

package Lab;

import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
	   
      int year;
      
      System.out.println("Enter an Year :: ");
      
    //Creating Scanner object to take input from user 
      
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();
      
      
      //For Leap Year We Verify 3 Condition Divisble By (4,400) But Not Divisible By (100)
      
      // If is used to verify Given Condition is True then print Leap Year

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Given year is a leap year");
      
      //Else Is used to print Not Leap year when Given Condition is False.
      
      else
         System.out.println("Given year is not a leap year");
   }
}



//Q3-WAP to print Reverse of numbers for example 10 9 8 7 6 5 4 3 2 1 using do-while loop and take the input from the user.

package Corejava;
import java.util.Scanner;
class DoWhileReverse{
public static void main(String args[]){
int num,rem,reversed_Num=0;
Scanner scan=new Scanner(System.in);

//This statements takes input from the user

System.out.print("Enter the number for find reverse: ");

//get input and it is stored num variable

num=scan.nextInt();
do{
    rem=num%10;
    reversed_Num=reversed_Num*10+rem;
    num=num/10;
}while(num>0);

System.out.print("Reverse of the number is: "+reversed_Num);
}
}
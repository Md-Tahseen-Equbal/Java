
// Q1-WAP to print table of any number using for loop and take the input from the user.

package Corejava;
import java.util.Scanner;  
public class Table  
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
//reading a number whose table is to be print  
int num=sc.nextInt();  
//loop start execution form and execute until the condition i<=10 becomes false  
for(int i=1; i <= 10; i++)  
{  
//prints table of the entered number      
System.out.println(num+" * "+i+" = "+num*i);  
}  
}  
}
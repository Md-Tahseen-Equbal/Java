
//Q3-WAP to create ReversePyramid

package Lab;

import java.util.Scanner;

 class ReversePyramid
{
    public static void main(String[] args)
    {
    	
     // Creating Scanner For Taking user Input
    	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Num : ");
	
	//Symbol Choose
	
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
           char c = sc.next().charAt(0);
      
    // Loop Using For Printing Reverse Star       
 
	for(int i=n;i>0 ;i--)
               {
	        for(int j=0;j<n-i;j++)
                
                       {
                               System.out.print(" ");
                       }
                       for(int j=0;j<(i*2)-1;j++)
                
                       {
                               System.out.print(c);
                       }
                      System.out.println();
               }                          
    }
}
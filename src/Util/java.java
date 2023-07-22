package Util;
import java.util.Scanner;
public class java 
{
     static int Factorial(int value)
    {
        if(value==1)
            return 1;
        else
            return(value*Factorial(value-1));
    }
        public static void main (String[]args)
        {
            Scanner Scan =new Scanner(System.in);
            System.out.println("Enter a number");
            int num=Scan.nextInt();
            int fact=Factorial(num);
            System.out.println("The factorial of the number is:" +fact);
        }
}
// Write a program to display the factorial of the numbers 1,2,3,4,5 using user defined method in java ?
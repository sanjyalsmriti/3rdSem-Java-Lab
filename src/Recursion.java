import java.util.Scanner;
public class Recursion 
{
     static int Factorial(int value)
    {
        if(value==0)
            return 1;
        else
            return(value*Factorial(value-1));
    }
        public static void main (String[]args)
        {
            Scanner Scan =new Scanner(System.in);
            System.out.println("Enter a number");
            int num=Scan.nextInt();
            int num2=Scan.nextInt();
            int num3=Scan.nextInt();
            int fact=Factorial(num);
            int fact2=Factorial(num2);
            int fact3=Factorial(num3);


            System.out.println("The factorial of the number is:" +fact);
            System.out.println("The factorial of the number is:" +fact2);
            System.out.println("The factorial of the number is:" +fact3);

            

            
        }
}
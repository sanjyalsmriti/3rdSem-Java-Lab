import java.util.Scanner;
public class 
        Factorial{
    public static int factorial(int value){
        
        if(value==1)
            return 1;
        else
            return(value*factorial(value-1));
        
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int value=scan.nextInt();
        factorial(value);
        System.out.println("Factorial is:"+ factorial(value));
    }
}
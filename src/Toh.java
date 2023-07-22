
import java.util.Scanner;


public class Toh {
    static void ToH (int n, char from_rod, char to_rod,char aux_rod)
    {
        if (n==1)
        {
            System.out.println (" Move disc 1 from rod "+from_rod + " to_rod "+to_rod);
            return;
        }
        ToH (n-1,from_rod,aux_rod, to_rod);
        System.out.println (" move disk " + n +" from rod "+from_rod+" to rod "+to_rod);
        ToH (n-1,aux_rod,to_rod,from_rod);
    }

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
       
        
        ToH ( n,'a','c','b');
       
    }
    
}
    


public class Fibonacci {

   static int  Fibo (int n)
    {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else 
            return (Fibo(n-1)+Fibo (n-2));
    }
    public static void main(String[] args)
    {
        int N=10;
        int i;
        for (i=0;i<=N-1;i++)
        {
        System.out.print (Fibo(i)+" ");
        }
    }
}

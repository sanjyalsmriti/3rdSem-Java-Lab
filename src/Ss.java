
public class Ss 
{
    int p;
     public Ss() // no arhument constructor //
    {
        System.out.println("Iam default constructor");
        
    }
    public static void main (String[]args)
    {
        Ss x=new Ss();
        Ss y =new Ss(12);
        System.out.println("Iam already invoked");
    }
    public Ss(int s) //Parameterized constructor //
    {
        System.out.println("value of s:12");
    }
    
}
// the name of the constructor and name of class is always same //
// contructctor have no return type (non return type) void ko agadi int lekhna  paidaina //
//but costructor ko specifier like public haru chai hunxa //

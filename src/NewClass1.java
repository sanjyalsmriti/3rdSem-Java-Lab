public class NewClass1 {
    public int display(int x,int y)
    {
        return x+y;
    }
    public static void main (int p,int q )
    {
        System.out.println("value:"+(p+q));
    }
    public static void  main (String[]args)
    {
        NewClass1 obj = new NewClass1 ();
        System.out.println(obj.display(2,4));
 
    obj.display(10,12);
    }
    
}
// multiple inheritan
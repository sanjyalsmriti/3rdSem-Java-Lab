class F
{
    public void print_ss()
    {
        System.out.println("SMIRITI");
    }
}
class two extends F {
    public void print_for()
    {
        System.out.println("for");
    }
}
public class Singleinheritance
{
    public static void main(String[]args)
    {
        two g = new two();
        g.print_ss();
        g.print_for();
        g.print_ss();
    }
}
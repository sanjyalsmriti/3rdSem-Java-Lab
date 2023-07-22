
public class doubleparameters {
  public double sum(double x, double y) 
  { 
      return (x + y); 
  } 
    public static void main(String args[]) 
    { 
        doubleparameters s = new doubleparameters(); 
        System.out.println(s.sum(110, 150));
        System.out.println(s.sum(250, 340));
        System.out.println(s.sum(100,340));
        System.out.println(s.sum(250,200));
        System.out.println(s.sum(230,100));
    }
}

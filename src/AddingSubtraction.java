class Addition{
    //same method but different class
    // parent ko method lai child ley overide garxa 
    public void add(int a, int b)
    {
       System.out.println("The Calculated number is "+ (a+b));
    }
   //same method but different class
     public void sub(int a , int b){
    System.out.println("The Calculated number is "+ (a-b));
     }     
}

class  Calculator extends Addition{
    public void add(int a, int b)
    {
       System.out.println("The Calculated number is "+ (a+b));
    }
    
     public void sub(int a , int b){
    System.out.println("The Calculated number is "+ (a-b));
     } 
}
    
public class AddingSubtraction{
    public static void main(String[]args){
       Calculator c=new Calculator();
       c.add(10,50);      
       c.sub(70, 50);
       
    }    

}
// parent ko method lai child ley overide garxa // 
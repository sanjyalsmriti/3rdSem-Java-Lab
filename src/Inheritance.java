
public class Inheritance {
    interface one 
{ 
    public void print_ss(); 
} 
   
interface two 
{ 
    public void print_for(); 
} 
   
interface three extends one,two 
{ 
    public void print_ss(); 
} 
class i implements three 
{ 
    @Override
    public void print_ss() { 
        System.out.println("Multiple Inheritance can be done using interface"); 
    } 

    
}
public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
  
// Drived class 
public class Interface 
{ 
    public static void main(String[] args) 
    { 
        child c = new child(); 
        c.print_ss(); 
        c.print_for(); 
        c.print_ss(); 
    } 
}


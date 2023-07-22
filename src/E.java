

    interface A
    {
        public void display();
    }
    interface B
    {
        public void output ();
    }
    interface C extends A,B
    {
        public void display();
    }
    class D implements C
    {
        public void display ()
        {
            System.out.println("HAPPY ELEMENTS");
        }
        public void output ()
        {
            System.out.println("Happy Again");
        }
    }
     public class E
    {
     public static void main(String[]args)
    {
        D c=new D();
        c.display();
        c.output();
        c.display();
    }
}
    
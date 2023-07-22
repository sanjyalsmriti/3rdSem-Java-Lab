class App {
    
     int value ; // data hiding
    public void setvalue (int x)
    {
        value= x;
    }
    class c{
        public static  void main(String[]args)
        {
    App obj=new App ();
    obj.setvalue (40);
}
    }
}

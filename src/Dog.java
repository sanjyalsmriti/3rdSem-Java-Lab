
class Animal
{
    public void move()
    {
        System.out.println("Happy Moving");
    }
    public void eat()
    {
        System.out.println("Happy Moving");
    }
    public void bark()
    {
        System.out.println("Happy Face");
    }
    
}
public class Dog extends Animal
{
    public void move()
    {
        System.out.println("Happy Life");
    }
    public static void main(String[]args)
    {
        Dog d = new Dog();
        d.move();
        d.eat();
        d.bark();
    }
}


package PKMC;
class PKMC
{
String color;
int age;
void intobj(String c,int a)
{
color=c;
age=a;
}
public static void main(String[] args)
{
PKMC obj=new PKMC();
obj.intobj("black",10);
obj.display();
}
void display()
{
System.out.println(color+" "+age);
}
}

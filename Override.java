class Parent
{
void display()
{
System.out.println("parent");
}
}
class Child extends Parent
{
void display()
{
System.out.println("Child");
super.display();
}
}
public class Override
{
public static void main(String[] args)
{
Child c=new Child();
c.display();
}
}
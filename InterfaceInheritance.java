interface Printable
{
void print();
}
interface Showable extends Printable
{
void show();
}
class InterfaceInheritance implements Showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
public static void main(String[] args)
{
InterfaceInheritance ob=new InterfaceInheritance();
ob.print();
ob.show();
}
}
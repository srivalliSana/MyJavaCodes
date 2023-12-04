class One
{
void display()
{
System.out.println("hi");
}
void display(int a)
{
System.out.println("a="+a);
}
}
class MethodOverload1
{
public static void main(String[] args)
{
One o=new One();
o.display();
o.display(5);
}
}
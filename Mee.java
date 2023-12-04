interface Printable
{
void print();
}
class Mee implements Printable
{
public void print()
{
System.out.println("Hello");
}
public static void main(String[] args)
{
Mee obj=new Mee();
obj.print();
}
}
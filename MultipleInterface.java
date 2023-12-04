interface Printable
{
void print();
}
interface Showable
{
void print();
}
class  implements Printable,Showable
{
public void print()
{
System.out.println("Hello");
}
public static void main(String[] args)
{
MultipleInterface ob=new MultipleInterface();
ob.print();
}
}
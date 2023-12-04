interface Printable
{
void print();
}
interface Showable
{
void print();
}
class MultipleInterfaceVthoutPub implements Printable,Showable
{
 void print()
{
System.out.println("Hello");
}
 public static void main(String[] args)
{
MultipleInterfaceVthoutPub ob=new MultipleInterfaceVthoutPub();
ob.print();
}
}
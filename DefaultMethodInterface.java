interface Draw
{
void draw();
 default void msg()
{
System.out.println("default method");
}
}
class Rectangle implements Draw
{
public void draw()
{
System.out.println("drawing rectangle");
}
}
class DefaultMethodInterface
{
public static void main(String[] args)
{
Draw ob=new Rectangle();
ob.draw();
ob.msg();
}
}
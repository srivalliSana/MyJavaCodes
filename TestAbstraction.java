abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
void draw()
{
System.out.println("drawing rectangle");
}
}
class Circle extends Shape
{
void draw()
{
System.out.println("drawing circle");
}
}
class TestAbstraction
{
public static void main(String[] args)
{
Shape r=new Rectangle();
r.draw();
Shape c=new Circle();
c.draw();
}
}
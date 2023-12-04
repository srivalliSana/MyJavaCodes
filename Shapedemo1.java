abstract class Shape
{
abstract double area();
}
class Rectangle extends Shape
{
double l=12.5,b=2.5;
double area()
{
return l*b;//used to give the out put like s.o.p
}
}
class Triangle extends Shape
{
double k=12.5,h=2.5;
double area()
{
return 0.5*k*h;
}
}
class Square extends Shape
{
double s=6.5;
double area()
{
return 4*s;
}
}
class Shapedemo1
{
public static void main(String[] args)
{
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Square s1=new Square();
System.out.println("rectangle area is:"+r.area());
System.out.println("triangle area is:"+t.area());
System.out.println("square area is:"+s1.area());
}
}




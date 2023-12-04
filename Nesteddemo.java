import java.lang.*;

class Outer
{
int m=10;
class Inner
{
int n=20;
void display()
{
System.out.println("m = "+m);
System.out.println("n = "+n);
}
}
}

class Nesteddemo

{
public static void main(String arg[])
{
Outer outobj=new Outer();
Outer.Inner inobj=outobj.new Inner();
inobj.display();
}
}


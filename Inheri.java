class A
{
int a=10;
void display()
{
System.out.println("PARENT CLASS");
}
}
class B extends A
{
int b=20;
void show()
{
System.out.println("CHILD CLASS");
}
}
class Last extends A
{
int c=45;
void valli()
{
System.out.println("ANOTHER CHILD CLASS");
}
}
class Inheri
{
public static void main(String[] args)
{
Last ob=new Last();
B obj=new B();
System.out.println("Child:"+ob.c);
ob.valli();
System.out.println("child:"+obj.b);
obj.show();
System.out.println(" Another parent:"+ob.a);
ob.display();
}
}
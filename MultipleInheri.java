class A
{
int a=10;
void display()
{
System.out.println("PARENT CLASS");
}
}
class B 
{
int b=20;
void show()
{
System.out.println("CHILD CLASS");
}
}
class Last extends A,B
{
int c=45;
void valli()
{
System.out.println("ANOTHER CHILD CLASS");
}
}
class MultipleInheri
{
public static void main(String[] args)
{
Last ob=new Last();
System.out.println("Child:"+ob.c);
ob.valli();

System.out.println("parent:"+ob.b);
ob.show();
System.out.println(" Another parent:"+ob.a);
ob.display();
}
}
class StaticDemo1
{
static int a=10;
static void display()
{
System.out.println("static method");
}
static
{
System.out.println("static block");
}
public static void main(String[] args)
{
System.out.println(a);
}
}


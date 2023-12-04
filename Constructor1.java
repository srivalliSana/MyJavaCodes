class Constructor1
{
String name;
int id;
Constructor1()
{
name="srivalli";
id=10;
}
Constructor1(String s,int n)
{
name = s;
id = n;
}
public static void main(String[] args)
{
Constructor1 s1=new Constructor1();
Constructor1 s2=new Constructor1("valli",17);
System.out.println(s1.name);
System.out.println(s1.id);
System.out.println(s2.name);
System.out.println(s2.id);
}
}
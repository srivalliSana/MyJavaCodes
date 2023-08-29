class Constructor
{
String name;
int id;
Constructor()
{
name= "sophia";
id= 10;
}
Constructor(String s, int n)
{
name = s;
id = n;
}
public static void main(String[] args)
{
Constructor s1 = new Constructor();
Constructor s2 = new Constructor("pooja",1);
System.out.println(s1.name);
System.out.println(s1.id);
System.out.println(s2.name);
System.out.println(s2.id);
}
}
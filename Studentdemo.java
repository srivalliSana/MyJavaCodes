import java.lang.*;
class Student
{
String name;
int regno;
int marks1,marks2,marks3;
Student()
{
name="srivalli";
regno=1380029;
marks1=56;
marks2=47;
marks3=78;
}
Student(String n,int r,int m1,int m2,int m3)
{
name=n;
regno=r;
marks1=m1;
marks2=m2;
marks3=m3;
}
Student(Student s)
{
name=s.name;
regno=s.regno;
marks1=s.marks1;
marks2=s.marks2;
marks3=s.marks3;
}
void display()
{
System.out.println(name+"\t"+regno+"\t"+marks1+"\t"+marks2+"\t"+marks3);
}
}
class Studentdemo
{
public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student("valli",12323,58,96,84);
Student s3=new Student(s1);
s2.display();
s3.display();
}
}
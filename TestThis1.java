class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+""+name+""+fee);
}
}
public class TestThis1
{
public static void main(String[] args)
{
Student s1=new Student(29,"srivalli",5000f);
Student s2=new Student(9,"valli",5000f);
s1.display();
s2.display();
}
}


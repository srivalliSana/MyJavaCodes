abstract class Bike
{
Bike()
{
System.out.println("bike is created");
}
abstract void run();
void changeGear()
{
System.out.println("gear changed");
}
}
class Duke extends Bike
{
void run()
{
System.out.println("running safely");
}
}
class Bikess
{
public static void main(String[] args)
{
Bike obj=new Duke();
obj.run();
obj.changeGear();
}
}

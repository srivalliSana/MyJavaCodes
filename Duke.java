abstract class Bikes
{
abstract void run();
}
class Duke extends Bikes
{
void run()
{
System.out.println("Running Safely");
}
public static void main(String[] args)
{
 Bikes obj=new Duke();
 obj.run();
}
}
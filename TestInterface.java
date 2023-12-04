interface Bank
{
float rateOfIntrest();
}
class Sbi implements Bank
{
public float rateOfIntrest()
{
return 9.7f;
}
}
class Pnb implements Bank
{
public float rateOfIntrest()
{
return 9.15f;
}
}
class TestInterface
{
public static void main(String[] args)
{
Bank s=new Sbi();
Bank p=new Pnb();
System.out.println("  SROI"+ s.rateOfIntrest());
System.out.println("  PROI"+ p.rateOfIntrest());
}
}
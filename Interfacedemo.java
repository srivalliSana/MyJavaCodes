interface Area {
  float computer(float x, float y);
  float area(float x,float y);
}

class Rectangle implements Area {
   private final float pi = 3.14f;

  public float computer(float x, float y) {
    return x * y;
  }


}
class Circle implements Area {
  float pi = 3.14f;

  public float area(float x, float y) {
    return pi * x * y;
  }
public float getpi()
{
return pi;
}
}

class Interfacedemo {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    Circle c = new Circle();
    Area a;
    a = r;
    a = c;
    System.out.println("Area of rectangle=" + a.computer(20, 10));
    System.out.println("Area of circle=" + a.area(10, 10));
  }
}
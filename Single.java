
class Single {
    int a = 10;
    void display() {
        System.out.println("PARENT CLASS");
    }
}

class B extends A {
	int b=20;	
    void show() {
        System.out.println("CHILD CLASS");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Child class Variable = " + obj.b);
        obj.show();
        System.out.println("Parent class Variable = " + obj.a);
        obj.display();
    }
}

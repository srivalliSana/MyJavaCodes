class Multi {
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
class C extends B {
	int c=30;
     void prem() {
	System.out.println("CHILD CLASS 2");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println("Child class Variable = " + obj.b);
        obj.show();
        System.out.println("Child class 2 Variable = " + obj.c);
 	obj.prem();
        System.out.println("Parent class Variable = " + obj.a);
        obj.display();
    }
}

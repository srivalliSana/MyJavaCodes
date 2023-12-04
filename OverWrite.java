class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child");
super.display();
    }
}

public class Overwrite {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
       
    }
}
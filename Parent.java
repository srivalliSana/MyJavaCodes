
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }

    int a = 40;

    void display() {
        System.out.println("PARENT CLASS");
    }
}

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }

        int a = 30;

        void display() {
            System.out.println("CHILD CLASS");
            System.out.println(a);
            System.out.println(super.a);
            super.display();
        }
}
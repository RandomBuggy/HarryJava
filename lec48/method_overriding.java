class A {
    public int harry() {
        return 4;
    }
    public void meth2() {
        System.out.println("I am method 2 from class A");
    }
}

class B extends A {
    public void meth3() {
        System.out.println("I am method 3 from class B");
    }
    // overriding meth2()
    @Override
    public void meth2() {
        System.out.println("I am method 2 from class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        b.meth3();
        // method overloading - same class
        // method overriding - inherited class
        // overriding 3 condition - 1. argument list are same and 2. return type are same or sub type, 3. access modifier level not restricted
        // can not overriding - static methods, final methods etc.
        // @Override - decorator (recommanded)
    }
}


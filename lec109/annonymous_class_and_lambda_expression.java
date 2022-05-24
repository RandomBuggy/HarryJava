interface InterfaceDemo {
    void method();
    void method2();
}

@FunctionalInterface
interface FuncInterface {
    void demo(String argument);
}
class AnnonyDemo implements InterfaceDemo {
    public void display() {
        System.out.println("Hello");
    }
    @Override
    public void method() {
        System.out.println("I am method()");
    }
    @Override
    public void method2() {
        System.out.println("I am method2()");
    }
}

public class annonymous_class_and_lambda_expression {
    public static void main(String[] args) {
        AnnonyDemo obj = new AnnonyDemo();
        obj.method();
        // nameless class -anonymous class - one time use only
        // use dynamic method dispatch as for interface reference - for a nameless class
        // class :- access_modifier(optional) class class_name {class content}
        // anonymous_class :- interface obj = new interface() {anonymous_class content};
        InterfaceDemo OBJ = new InterfaceDemo() {
            @Override
            public void method() {
                System.out.println("method() : from anonymous class");
            }
            @Override
            public void method2() {
                System.out.println("method2() : from anonymous class");
            }
        };
        OBJ.method();
        // lambda expressions - reference to the object that implements a FunctionalInterface
        // syntax:- Interface (as data type) obj = () -> {as interface has only one method, so override that method};
        FuncInterface object = (argument) -> {
            System.out.println("FunctionalInterface method overridden from lambda expressions" + argument);
        };
        object.demo("argument passed");
    }
}


abstract class Base {
    public Base() {
        System.out.println("I am a constructor");
    }

    public void sayHello() {
        System.out.println("Hello World");
    }
    abstract public void greet();
}

class Derived extends Base {
    public Derived() {
        System.out.println("I am a derived class constructor");
    }
    
    @Override
    public void greet() {
        System.out.println("Good Morning");
    } 
}

public class abstract_class_and_abstract_methods {
    public static void main(String[] args) {
        // abstract method - method without implementation (mostly like function prototype in c/c++)
        // abstract class - a class contains abstract method
        // for abstract methods and abstract classes "abstract" key word is used
        // and abstract method are fell free to implement custom version in every derived classes
        // abstract class's object can not be created because of it is only a standard definition of other (inherited) class
        Derived obj = new Derived();
        obj.greet();
    }
}


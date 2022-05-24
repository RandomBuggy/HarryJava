class Phone {
    public void on() {
        System.out.println("Turing on phone...");
    }
    public void greet() {
        System.out.println("Good Morning");
    }
}

class SmartPhone extends Phone {
    @Override
    public void on() {
        System.out.println("Turing on smartphone...");
    }
    public void swagat() {
        System.out.println("Apka Swagat hai");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        System.out.println("");
        // Phone obj = new Phone(); // allowed
        // obj.name();
        // SmartPhone smobj = new SmartPhone(); // allowed
        // smobj.name();
        


        // but object is from SubClass and reference is of SuperClass type is also allowed but vice versa not possible
        // dynamic method dispatch
        Phone obj = new SmartPhone();
        // SmartPhone obj2 = new Phone();
        obj.on();
        // overrided method will run of the actual object (SubClass)
        // but only can run the common (including overrided) method between SuperClass and SubClass and all method of SuperClass 
        // dynamic method dispatch is used for run-time polymorphism
    }
}


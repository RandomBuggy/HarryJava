class Base {
    private int x;

    public Base() {
        System.out.println("I am a base class constructor");
    }
    // overloaded constructor
    public Base(int x) {
        System.out.println("Base class overloaded constructor with value as " + x);
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}

class Derived extends Base {
    private int y;

    public Derived() {
        System.out.println("I am a derived class constructor");
    }
    // overloaded constructor
    public Derived(int x, int y) {
        super(x);
        System.out.println("Derived class overloaded constructor with value as " + y);
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class ChildDerived extends Derived {
    public ChildDerived() {
        System.out.println("I am a ChildDerived class constructor");
    }
    // overloaded constructor
    public ChildDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("ChildDerived class overloaded constructor with value as " + z);
    }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        System.out.println("Base Class Object");
        Base b = new Base();
        System.out.println("Derived Class Object");
        Derived d = new Derived();
        System.out.println("ChildDerived Class Object");
        ChildDerived cd = new ChildDerived();
        // overloaded
        System.out.println("Base Class Object");
        Base B = new Base(4);
        System.out.println("Derived Class Object");
        Derived D = new Derived(7, 8);
        System.out.println("ChildDerived Class Object");
        ChildDerived CD = new ChildDerived(1, 2, 3);
    }
}


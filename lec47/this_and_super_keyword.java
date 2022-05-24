// this keyword is a reference (pointer) to the current-class object. its is used to refer a function stack variable's value to the object' s variable and returning the current-class object as return value
// super keyword is used to refer parent class object. it can be also used to call intermediate parent class constructors or other methods or immediate parent class other methods or constructors or instance variables

class EkClass {
    private int x;
    public EkClass(int x) {
        this.x = x;
    }

    public EkClass setX(int x) {
        this.x = x;
        return this;
    }
}

class DoClass extends EkClass {
    private int z;
    DoClass(int x, int z) {
        super(x);
        this.z = z;
    }
}


public class this_and_super_keyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(0);
        EkClass retObj = e.setX(9);
        DoClass d = new DoClass(8, 9);
    }
}


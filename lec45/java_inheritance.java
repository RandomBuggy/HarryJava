class SuperClass {
    int x;
    public void setX(int i) {
        x = i;
    }
    public int getX() {
        return x;
    }
}

class SubClass extends SuperClass {
    int y;
    public void setY(int j) {
        y = j;
    }
    public int getY() {
        return y;
    }

}

public class java_inheritance {
    public static void main(String[] args) {
        // extends - keyword is used to inherit a sub-class/derived-class/child-class from the super-class/base-class/parent-class
        SuperClass b = new SuperClass();
        b.setX(4);
        System.out.println(b.getX());

        SubClass d = new SubClass();
        d.setX(7);
        System.out.println(d.getX());
        d.setY(8);
        System.out.println(d.getY());
    }
}


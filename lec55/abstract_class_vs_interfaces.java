interface BiCycle {
    // you can not modify properties of a interface because they are final
    int a = 45;
    void applyBreak(int increament);
    void speedUp(int decreament);
}

interface BlowHorn {
    void blowHornK3g();
    void blowHornMhn();
}

class AvonCycle implements BiCycle, BlowHorn {
    public void blowHorn() {
        System.out.println("Pee Pee Boo Boo");
    }
    // interface method implementation must be public
    public void applyBreak(int increament) {
        System.out.println("Applying Break...");
    }
    public void speedUp(int decreament) {
        System.out.println("Speeding Up...");
    }

    public void blowHornK3g() {
        System.out.println("Horn for K3G...");
    }

    public void blowHornMhn() {
        System.out.println("Horn for MHN...");
    }
}

public class abstract_class_vs_interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        System.out.println(cycle.a);
        // cycle.a = 78; /* throws error */
        cycle.blowHorn();
        cycle.applyBreak(7);
        cycle.speedUp(9);

        cycle.blowHornK3g();
        cycle.blowHornMhn();
    }
}


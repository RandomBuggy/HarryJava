class C1 {
    private int x = 5;
    protected int y = 45;
    public int z = 454;
    int a = 56;
}

// access modifiers
// modifier - class - package - subclass - world
// public   -   y   -    y    -    y     -   y  
// protected -  y   -    y    -    y     -   n  
// default  -   y   -    y    -    n     -   n  
// private  -   y   -    n    -    n     -   n  

public class access_modifiers {
    public static void main(String[] args) {
        System.out.println("");
    }
}


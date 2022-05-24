class MyEmployee {
    private int id;
    private String name;

    // setters
    public void setId(int i) {
        id = i;
    }
    public void setName(String n) {
        name = n;
    }
    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class access_modifiers_getters_and_setters {
    public static void main(String[] args) {
        // access modifiers - 4 types in JAVA - default, private,public, protected
        // wrong for private access modifiers
        // obj.properties = attributes
        // right way with getters and setters method
        MyEmployee harry = new MyEmployee();
        harry.setId(456);
        harry.setName("Code With Harry");

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}


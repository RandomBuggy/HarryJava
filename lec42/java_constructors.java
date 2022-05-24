class MyEmployee {
    private int id;
    private String name;

    // constructor - same name as class and no return type
    public MyEmployee() {
        id = 0;
        name = "Your-Name-Here";
    }
    // constructor overloading
    public MyEmployee(String name) {
        this.id = 2;
        this.name = name;
    }
    public MyEmployee(String name, int id) {
        this.id = id;
        this.name = name;
    }
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


public class java_constructors {
    public static void main(String[] args) {
        MyEmployee em = new MyEmployee();
        System.out.println("ID: " + em.getId());
        System.out.println("NAME: " + em.getName());
        MyEmployee harry = new MyEmployee("Code With Harry");
        System.out.println("ID: " + harry.getId());
        System.out.println("NAME: " + harry.getName());
        MyEmployee john = new MyEmployee("john", 500);
        System.out.println("ID: " + john.getId());
        System.out.println("NAME: " + john.getName());
    }
}


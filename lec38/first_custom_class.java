//class declaration
class Employee {
    // declaring properties
    int id;
    String name;
    // creating a method
    public void printDetails() {
        System.out.println("My ID is "+ id);
        System.out.println("My name is " + name);
    }
}

public class first_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our first custom class");
        // object instantiation - instance
        Employee harry = new Employee();
        // Setting properties
        harry.id = 12;
        harry.name = "CodeWithHarry";

        // object address
        System.out.println(harry);
        // printing object details - way 1
        System.out.println(harry.id);
        System.out.println(harry.name);
        //printing object details - way 2
        harry.printDetails();
    }
}


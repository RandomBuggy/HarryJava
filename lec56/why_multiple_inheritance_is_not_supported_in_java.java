public class why_multiple_inheritance_is_not_supported_in_java {
    public static void main(String[] args) {
        // because if ambiguity
        // inherit from base class and method (implementation) from interfaces
        // interface can only have method signature, (constant) fields - (properties) and default methods
        // fields can be overridden inside (implementation) class
        // in interface all the method are public
        // interfaces reference can be created but not the object
    }
}


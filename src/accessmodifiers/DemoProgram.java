package accessmodifiers;

// Base class to demonstrate access modifiers
class Parent {
    public String publicVar = "Public Variable";        // Accessible anywhere
    private String privateVar = "Private Variable";     // Accessible only in this class
    protected String protectedVar = "Protected Variable"; // Accessible in same package & subclasses
    String defaultVar = "Default Variable";             // Accessible only within the same package

    // Public method
    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private Method: Accessible only within the class");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within package & subclasses");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default Method: Accessible within the same package");
    }

    // Method to demonstrate private access
    public void accessPrivateMethod() {
        privateMethod(); // Can access private method inside the class
    }
}

// Subclass in the same package
class Child extends Parent {
    public void showAccess() {
        System.out.println("\nInside Child Class (Same Package)");

        System.out.println(publicVar);   // Allowed
        // System.out.println(privateVar); // Not Allowed - private in Parent
        System.out.println(protectedVar); // Allowed - accessible in subclass
        System.out.println(defaultVar);   // Allowed - same package

        publicMethod();   // Allowed
        // privateMethod(); // Not Allowed
        protectedMethod(); // Allowed
        defaultMethod();   // Allowed
    }
}

// Another class in the same package
public class DemoProgram {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("Inside Main Class");

        System.out.println(p.publicVar);  // Allowed
        // System.out.println(p.privateVar); // Not Allowed
        System.out.println(p.protectedVar); // Allowed (same package)
        System.out.println(p.defaultVar);   // Allowed (same package)

        p.publicMethod();   // Allowed
        // p.privateMethod(); // Not Allowed
        p.protectedMethod(); // Allowed
        p.defaultMethod();   // Allowed

        p.accessPrivateMethod(); // Accessing private method via public method

        Child c = new Child();
        c.showAccess(); // Demonstrating access in subclass
    }
}


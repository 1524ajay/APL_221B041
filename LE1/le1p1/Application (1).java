class Mother {
    int x;

    void show() {
        System.out.println("Mother's show method");
    }

    static void staticShow() {
        System.out.println("Mother's static show method");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Child's show method");
    }

    static void staticShow() {
        System.out.println("Child's static show method");
    }
}

class One {
    One() {
        System.out.println("Constructor of One");
    }
}

class Two extends One {
    Two() {
        System.out.println("Constructor of Two");
    }
}

public class Application {
    public static void main(String[] args) {
        // Problem 1: Inheritance and Overriding
        System.out.println("Testing Inheritance and Overriding:");

        // Calling show() using an instance of Mother
        Mother m = new Mother();
        m.show();  // Should print "Mother's show method"

        // Calling show() using an instance of Child
        Child ch = new Child();
        ch.show();  // Should print "Child's show method"

        // Polymorphism: Mother reference pointing to Child object
        Mother m1 = new Child(); 
        m1.show();  // Should print "Child's show method" (because show() is overridden)

        System.out.println("\nTesting Static Methods:");

        // Static methods: 
        // Static methods are not polymorphic, so they are called based on the class type
        Mother.staticShow(); // Should print "Mother's static show method"
        Child.staticShow();  // Should print "Child's static show method"

        System.out.println("\nTesting Parameterized Constructor:");

        // Creating an object of class Two
        Two t = new Two();  // Should call the constructor of One and then Two
    }
}

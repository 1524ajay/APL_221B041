class Two extends One {
    // Constructor for Two
    Two(int x) {
        // Explicitly calling the parameterized constructor of class One
        super(x);
        System.out.println("Two's constructor, x = " + x);
    }
}
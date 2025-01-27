public class problem2 {
    public static void main(String[] args) {
        // Creating an instance of Mother and calling the show method
        Mother mother = new Mother();
        mother.show();  // Output: Hello World

        // Creating an instance of Child and calling the show method
        Child child = new Child();
        child.show();  // Output: Hello JUET
        
        // Creating a reference of Mother but pointing to Child (Polymorphism)
        Mother polyMother = new Child();
        polyMother.show();  // Output: Hello JUET (method overridden in Child)
    }
}

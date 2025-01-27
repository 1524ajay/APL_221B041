public class problem3 {
    public static void main(String[] args) {
        Mother m1 = new Child();  // Polymorphism: Mother reference, Child object
        m1.show();  // Calls the overridden show() in Child class
    }
}

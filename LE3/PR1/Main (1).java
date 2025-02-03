
public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi vikarn = new Vikarn();
        Bharatvanshi kaurav = new Kaurav();

        System.out.println("Testing Arjun:");
        arjun.fight();
        ((Arjun) arjun).obey();
        ((Arjun) arjun).kind();

        System.out.println("\nTesting Bheem:");
        bheem.fight();
        ((Bheem) bheem).obey();
        ((Bheem) bheem).kind();

        System.out.println("\nTesting Vikarn:");
        vikarn.fight();
        ((Vikarn) vikarn).obey();  // Calling the implemented obey() method
        ((Vikarn) vikarn).kind();

        System.out.println("\nTesting Kaurav:");
        kaurav.fight();
        ((Kaurav) kaurav).disobey();
        ((Kaurav) kaurav).kind();
    }
}

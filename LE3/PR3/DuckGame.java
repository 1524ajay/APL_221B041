public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performSwim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println();

        woodenDuck.display();
        woodenDuck.performSwim();
        woodenDuck.performFly();
        woodenDuck.performQuack();

        System.out.println();

        redHeadDuck.display();
        redHeadDuck.performSwim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println();

        lakeDuck.display();
        lakeDuck.performSwim();
        lakeDuck.performFly();
        lakeDuck.performQuack();
    }
}

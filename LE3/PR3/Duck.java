abstract class Duck {
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println("This is a " + this.getClass().getSimpleName());
    }
}
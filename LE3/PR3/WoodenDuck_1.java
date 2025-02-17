class WoodenDuck extends Duck {
    public WoodenDuck() {
        swimBehavior = new CanSwim();
        flyBehavior = new CannotFly();
        quackBehavior = new Mute();
    }
}
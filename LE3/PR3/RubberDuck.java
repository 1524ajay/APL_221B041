class RubberDuck extends Duck {
    public RubberDuck() {
        swimBehavior = new CanSwim();
        flyBehavior = new CannotFly();
        quackBehavior = new Mute();
    }
}
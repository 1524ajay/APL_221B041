class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        swimBehavior = new CanSwim();
        flyBehavior = new CanFly();
        quackBehavior = new Quack();
    }
}
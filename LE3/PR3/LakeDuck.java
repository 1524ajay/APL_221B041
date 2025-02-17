class LakeDuck extends Duck {
    public LakeDuck() {
        swimBehavior = new CanSwim();
        flyBehavior = new CanFly();
        quackBehavior = new Quack();
    }
}

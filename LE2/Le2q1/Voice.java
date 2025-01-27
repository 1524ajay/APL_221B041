class Voice {
    Animal[] animals = new Animal[5];
    public void prepareVoice() {
        animals[0] = new Cow();   // Cow at index 0
        animals[1] = new Dog();   // Dog at index 1
        animals[2] = new Pig();   // Pig at index 2
        animals[3] = new Goat();  // Goat at index 3
        animals[4] = new Lion();  // Lion at index 4
    }
    

    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();  
        }
    }
}

package inheritance.polymorphism;

import inheritance.Animal;

public class Goat extends Animal {

    public Goat() {
        super("goat", 2, 40);
    }

    public boolean isQurbanValid() {
        return this.getAge() >= 2 && this.getAge() <= 5 && this.getWeight() >= 40
                && this.getWeight() <= 60;
    }
}

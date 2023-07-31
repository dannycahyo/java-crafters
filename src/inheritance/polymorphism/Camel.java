package inheritance.polymorphism;

import inheritance.Animal;

public class Camel extends Animal {
    public Camel() {
        super("camel", 5, 400);
    }

    public boolean isQurbanValid() {
        return this.getAge() >= 2 && this.getAge() <= 5 && this.getWeight() >= 400
                && this.getWeight() <= 600;
    }
}

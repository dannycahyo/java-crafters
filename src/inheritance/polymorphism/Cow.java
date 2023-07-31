package inheritance.polymorphism;

import inheritance.Animal;

public class Cow extends Animal {
    public Cow() {
        super("cow", 5, 400);
    }

    public boolean isQurbanValid() {
        return this.getAge() >= 2 && this.getAge() <= 5 && this.getWeight() >= 400
                && this.getWeight() <= 600;
    }
}

package inheritance.polymorphism;

import inheritance.Animal;

public class Sheep extends Animal {
    public Sheep() {
        super("sheep", 1, 30);
    }

    public boolean isQurbanValid() {
        return this.getAge() >= 2 && this.getAge() <= 5 && this.getWeight() >= 40
                && this.getWeight() <= 60;
    }
}

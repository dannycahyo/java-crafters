package inheritance.polymorphism;

import inheritance.Animal;

public class CleanQurban {
    public static void main(String[] args) {
        Goat goat = new Goat();
        System.out.println(goat.isQurbanValid());

        Cow cow = new Cow();
        System.out.println(cow.isQurbanValid());

        Sheep sheep = new Sheep();
        System.out.println(sheep.isQurbanValid());

        Camel camel = new Camel();
        System.out.println(camel.isQurbanValid());
    }

    public static boolean isValidQurbanAnimal(Animal animal) {
        return animal.isQurbanValid();
    }
}

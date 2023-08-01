package inheritance.polymorphism;

import inheritance.Animal;

public class CleanQurban {
    public static void main(String[] args) {
        Goat goat = new Goat();
        System.out.println(isValidQurbanAnimal(goat));

        Cow cow = new Cow();
        System.out.println(isValidQurbanAnimal(cow));

        Sheep sheep = new Sheep();
        System.out.println(isValidQurbanAnimal(sheep));

        Camel camel = new Camel();
        System.out.println(isValidQurbanAnimal(camel));
    }

    public static boolean isValidQurbanAnimal(Animal animal) {
        return animal.isQurbanValid();
    }
}

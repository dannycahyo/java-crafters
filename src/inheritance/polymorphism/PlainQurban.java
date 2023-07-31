package inheritance.polymorphism;

import inheritance.Animal;

public class PlainQurban {
    public static void main(String[] args) {
        Animal goat = new Animal("goat", 2, 50);
        boolean isValidGoat = isValidQurbanAnimal(goat);
        System.out.println("isValidGoat: " + isValidGoat);

        Animal cow = new Animal("cow", 3, 200);
        boolean isValidCow = isValidQurbanAnimal(cow);
        System.out.println("isValidCow: " + isValidCow);

        Animal camel = new Animal("camel", 5, 500);
        boolean isValidCamel = isValidQurbanAnimal(camel);
        System.out.println("isValidCamel: " + isValidCamel);

        Animal sheep = new Animal("sheep", 1, 30);
        boolean isValidSheep = isValidQurbanAnimal(sheep);
        System.out.println("isValidSheep: " + isValidSheep);

    }

    public static boolean isValidQurbanAnimal(Animal animal) {
        switch (animal.getType()) {
            case "goat":
                return animal.getAge() >= 2 && animal.getAge() <= 5 && animal.getWeight() >= 40
                        && animal.getWeight() <= 60;
            case "cow":
                return animal.getAge() >= 3 && animal.getAge() <= 5 && animal.getWeight() >= 200
                        && animal.getWeight() <= 300;
            case "camel":
                return animal.getAge() >= 5 && animal.getAge() <= 7 && animal.getWeight() >= 400
                        && animal.getWeight() <= 600;
            case "sheep":
                return animal.getAge() >= 1 && animal.getAge() <= 2 && animal.getWeight() >= 25
                        && animal.getWeight() <= 35;
            default:
                return false;
        }
    }
}

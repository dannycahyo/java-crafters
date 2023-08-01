package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();

        Cat cat = new Cat();
        cat.scratch();
        cat.makeSound();

        Animal jeki = new Dog();
        jeki.makeSound();
        jeki.eat();

        jeki = new Cat();
        // Type Casting
        // ((Cat) jeki).scratch();
        if (jeki instanceof Cat jekiCat) {
            jekiCat.scratch();
        }
    }
}

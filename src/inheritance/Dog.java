package inheritance;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog makeSound method called");
    }

    public void fetch() {
        System.out.println("Dog fetch method called");
    }
}

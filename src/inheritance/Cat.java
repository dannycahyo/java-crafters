package inheritance;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat makeSound method called");
    }

    public void scratch() {
        System.out.println("Cat scratch method called");
    }
}

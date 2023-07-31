package inheritance;

public class Animal {
    public String type;
    public int age;
    public int weight;

    public Animal() {
        this.type = "unknown";
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String type, int age, int weight) {
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animal makeSound method called");
    }

    public void eat() {
        System.out.println("Animal eat method called");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isQurbanValid() {
        return false;
    }
}

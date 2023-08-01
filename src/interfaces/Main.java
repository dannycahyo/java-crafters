package interfaces;

public class Main {
    public static void main(String[] args) {
        Product book = new Book("The Lord of the Rings", "J. R. R. Tolkien", "978-0544003415");
        book.setName("How to win friends and influence people");
        System.out.println(book.getName());
    }
}

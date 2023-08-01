package interfaces;

public class Book implements Product {
    private String name;
    private String author;
    private String isbn;

    public Book(String name, String author, String isbn) {
        setName(name);
        setAuthor(author);
        setIsbn(isbn);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

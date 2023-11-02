package bg.smg;

public class ChildrenBook extends Book{
    int age;

    public ChildrenBook(int age) {
        this.age = age;
    }

    public ChildrenBook(String title, Author author, BookType type, int availables, double price, int age) {
        super(title, author, type, availables, price);
        this.age = age;
    }
}

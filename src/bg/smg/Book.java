package bg.smg;

public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int available;
    private double price;

    public Book(){
        title = "";
        author = new Author();
        type = BookType.BOOK;
        available = 0;
        price = 0.00;

    }

    public Book(String title, Author author, BookType type, int available, double price) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.available = available;
        this.price = price;
    }

    @Override
    public String toString() {
        String ans =  "\"" + title + '\"';
        ans += " by " + author.name() + " ";
        ans += "\n\tcosts $" + price;
        ans += "\n\tavailable " + available;
        return ans;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

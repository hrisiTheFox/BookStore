package bg.smg;

public class ComicBook extends Book{
    private String characterName;

    public ComicBook(String characterName) {
        this.characterName = characterName;
        super.setType(BookType.COMIC_BOOK);
    }

    public ComicBook(String title, Author author, BookType type, int availables, double price, String characterName) {
        super(title, author, type, availables, price);
        this.characterName = characterName;
    }

}

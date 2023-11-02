package bg.smg;

public class ComicBook extends Book{
    private String characterName;

    public ComicBook(String characterName) {
        this.characterName = characterName;
        super.setType(BookType.COMIC_BOOK);
    }

    public ComicBook(String title, Author author, BookType type, int available, double price, String characterName) {
        super(title, author, type, available, price);
        this.characterName = characterName;
    }
    @Override
    public double getPrice(){
        return.super.getPrice()*0.6;
    }

    @Override
    public String toString() {
        String ans =  super.toString();
        ans += "\n\twith character " + characterName;
        return ans;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}

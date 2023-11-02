package bg.smg;

public class ChildrenBook extends Book{
    int age;

    public ChildrenBook(int age) {
        this.age = age;
    }

    public ChildrenBook(String title, Author author, BookType type, int available, double price, int age) {
        super(title, author, type, available, price);
        this.age = age;
    }

    @Override
    public double getPrice(){
        return.super.getPrice()*0.7;
    }

    @Override
    public String toString() {
        String ans =  super.toString();
        ans += "\n\tappropriate " + age;
        return ans;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

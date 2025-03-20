package slack.constructor;

public class Book {
    int id;
    String bookName;
    double price;
    String genre;
    String createDate;

    public Book(int id, String bookName, double price, String genre, String createDate) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.createDate = createDate;
    }

    public String toString() {
        return "Book: " + bookName + " (ID: " + id + ", Genre: " + genre + ", Price: $" + price +
                ", Created: " + createDate + ")";
    }
}

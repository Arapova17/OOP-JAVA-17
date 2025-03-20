package modifier.task_user;

public class Book extends Product{
    private long id;
    private String author;

    public Book() {
    }

    public Book(long id, String author) {
        this.id = id;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getAuthor(){
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book" +
                "\nid = " + id +
                "\nauthor = " + author + "\n";
    }
}

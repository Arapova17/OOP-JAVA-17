package slack.constructor;

public class ConstructorMain {
    public static void main(String[] args) {

        Book b1 = new Book(1, "Java Programming", 25.99, "Education", "2022-05-10");
        Book b2 = new Book(2, "Data Structures", 30.50, "Education", "2021-08-15");
        Book b3 = new Book(3, "Mystery of Code", 20.00, "Mystery", "2023-02-20");
        Book b4 = new Book(4, "History of AI", 40.75, "History", "2020-11-05");
        Book b5 = new Book(5, "Science Fiction World", 35.99, "Sci-Fi", "2019-06-30");

        Library l1 = new Library(1, "Central Library", "123 Main St", new Book[]{b1, b2, b3});
        Library l2 = new Library(2, "City Library", "456 Elm St", new Book[]{b4});
        Library l3 = new Library(3, "Town Library", "789 Oak St", new Book[]{b5});

        l1.displayBooks();

    }
}

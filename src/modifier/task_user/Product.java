package modifier.task_user;

import java.time.LocalDate;
import java.util.Scanner;

public class Product {
    private long id;
    private String name;
    private String description;
    private int price;
    private LocalDate createDate;
    private String type;
    private int productCount;

    public Product() {
    }

    public Product(long id, String name, String description, int price, LocalDate createDate, String type, int productCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createDate = createDate;
        this.type = type;
        this.productCount = productCount;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate createDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String type() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int productCount() {
        return productCount;
    }

    Scanner scannerForInt = new Scanner(System.in);
    Scanner scannerForString = new Scanner(System.in);

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String createProduct (User user){
        System.out.println("Select type' 1.Electronics ':' 2.Book'; ");
        int type = scannerForInt.nextInt();
        if (type == 1) {
            Electronics electronics = new Electronics();
            System.out.println("Write id");
            electronics.setId(scannerForInt.nextInt());
            System.out.println("Write brand");
            electronics.setBrand(scannerForString.nextLine());
            System.out.println("Write colour; ");
            electronics.setColour(scannerForString.nextLine());
            System.out.println("Write isNew: ");
            electronics.setNew(scannerForString.nextBoolean());
            System.out.println("Write memory: ");
            electronics.setMemory(scannerForInt.nextInt());
            user.addProductToArray(electronics);

        }else if (type == 2){
            Book book = new Book();
            System.out.println("Write id: ");
            book.setId(scannerForInt.nextInt());
            System.out.println("Author name: ");
            book.setAuthor(scannerForString.nextLine());
            user.addProductToArray(book);
        }else {
            return "Continue: ";
        }

        return "";
    }

    @Override
    public String toString() {
        return "Product" +
                "\nid = " + id +
                "\nname = " + name +
                "\ndescription = " + description +
                "\nprice = " + price +
                "\ncreateDate = " + createDate +
                "\ntype = " + type +
                "\nproductCount = " + productCount +
                "\nscannerForInt = " + scannerForInt +
                "\nscannerForString = " + scannerForString ;
    }
}

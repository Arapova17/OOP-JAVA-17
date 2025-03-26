package abstract_class;

public abstract class Product {
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getPrice();

    public abstract void getDetails();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}

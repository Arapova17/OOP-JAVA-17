package abstract_class;

public class Clothing extends Product{
    private int size;

    public Clothing(int size) {
        this.size = size;
    }

    public Clothing(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void getPrice() {

    }

    @Override
    public void getDetails() {

    }

    @Override
    public String toString() {
        return "Clothing{" +
                super.toString() +
                "size=" + size +
                '}';
    }
}
